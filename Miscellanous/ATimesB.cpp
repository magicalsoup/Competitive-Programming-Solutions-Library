#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <algorithm>
#include <vector>
#include <complex>
#include <cmath>
#include <iomanip>
using namespace std;

namespace myBigint {
	const int DIG = 9;
	const int R = 1000000000;
	const long long R2 = (long long)R * R;

	namespace FFT {
		const double PI = acos(-1.0);
		vector<int> rev;
		vector<complex<double> > w1, w2;

		void init(int n, int l) {
			rev.resize(n);
			rev[0] = 0;
			for (int i = 1; i < n; i++) rev[i] = (rev[i >> 1] >> 1) | ((i & 1) << (l - 1));
			w1.resize(n), w2.resize(n);
			int half = n >> 1;
			for (int i = 0; i < half; i++) w1[i | half] = complex<double>(cos(PI * i / half), sin(PI * i / half));
			for (int i = half - 1; i >= 0; i--) w1[i] = w1[i << 1];
			for (int i = 0; i < n; i++) w2[i] = conj(w1[i]);
		}

		void FFT_core(vector<complex<double> > &a, const vector<complex<double> > &w) {
			for (int i = 0; i < a.size(); i++)
				if (i < rev[i]) swap(a[i], a[rev[i]]);
			for (int i = 1; i < a.size(); i <<= 1)
				for (int j = 0; j < a.size(); j += 2 * i)
					for (int k = 0; k < i; k++) {
						complex<double> x = a[j + k], y = a[j + k + i] * w[i + k];
						a[j + k] = x + y;
						a[j + k + i] = x - y;
					}
		}

		void DFT(vector<complex<double> > &a) {
			FFT_core(a, w1);
		}

		void IDFT(vector<complex<double> > &a) {
			FFT_core(a, w2);
			for (int i = 0; i < a.size(); i++) a[i] /= a.size();
		}
	};

	struct Bigint {
		vector<long long> v;
		bool sign;
		Bigint(long long a = 0) : sign(false), v(0) {
			if(a < 0)
				sign = true, a = -a;
			while(a)
				v.push_back(a % R), a /= R;
		}

		Bigint operator - () const {
			Bigint ret = *this;
			ret.sign ^= 1;
			return ret;
		}

		int size() const {
			return v.size();
		}

		void resize(int x) {
			v.resize(x);
		}

		long long& operator [] (int x) {
			return v[x];
		}

		long long operator [] (int x) const {
			return v[x];
		}

		void pop_back() {
			v.pop_back();
		}

		void push_back(long long x) {
			v.push_back(x);
		}
	};

	ostream& operator << (ostream& out, const Bigint &s) {
		if (s.sign && s.size()) out << '-';
		if (!s.size()) out << 0;
		else {
			out << s[s.size() - 1];
			for (int i = s.size() - 2; i >= 0; i--)
				out << setw(DIG) << setfill('0') << s[i];
		}
		return out;
	}

	istream& operator >> (istream& in, Bigint &s) {
		string c;
		cin >> c;
		s = Bigint(0);
		if (c[0] == '-') s.sign = true, c = c.substr(1, c.size());
		else s.sign = false;
		if (c.size() == 1 && c[0] == '0') return in;
		s.resize((c.size() + DIG - 1) / DIG);
		for (int i = 0; i < s.size() - 1; i++)
			for (int j = (i + 1) * DIG - 1; j >= i * DIG; j--)
				s.v[i] = 10 * s[i] + c[c.size() - 1 - j] - '0';
		for (int j = c.size() - 1; j >= (s.size() - 1) * DIG; j--) s.v[s.size() - 1] = 10 * s[s.size() - 1] + c[c.size() - 1 - j] - '0';
		return in;
	}

	bool cmp_abs(const Bigint &a, const Bigint &b) {
		if (a.size() != b.size()) return a.size() < b.size();
		for (int i = a.size() - 1; i >= 0; i--)
			if(a[i] != b[i]) return a[i] < b[i];
		return false;
	}

	Bigint plus_abs(const Bigint &a, const Bigint &b) {
		Bigint ret;
		ret.resize(max(a.size(), b.size()) + 1);
		for (int i = 0; i < a.size(); i++) ret.v[i] += a[i];
		for (int i = 0; i < b.size(); i++) ret.v[i] += b[i];
		for (int i = 0; i < ret.size() - 1; i++) ret.v[i + 1] += ret.v[i] / R, ret.v[i] %= R;
		while (ret.size() && !ret[ret.size() - 1]) ret.pop_back();
		return ret;
	}

	Bigint minus_abs(const Bigint &a, const Bigint &b) {
		Bigint ret = a;
		for (int i = 0; i < b.size(); i++) { ret.v[i] -= b[i];
			if (ret.v[i] < 0) ret.v[i + 1] -= 1, ret.v[i] += R;
		}
		while (ret.size() && !ret[ret.size() - 1]) ret.pop_back();
		return ret;
	}

	Bigint operator + (const Bigint &a, const Bigint &b) {
		Bigint ret;
		if (a.sign == b.sign) ret = plus_abs(a, b), ret.sign = a.sign;
		else {
			if (cmp_abs(a, b)) ret = minus_abs(b, a), ret.sign = b.sign;
			else ret = minus_abs(a, b), ret.sign = a.sign;
		}
		return ret;
	}

	Bigint operator - (const Bigint &a, const Bigint &b) {
		return a + (-b);
	}

	Bigint multiply_abs_fft(const Bigint &a, const Bigint &b) {
		Bigint ret;
		vector<complex<double> > A, B, C;
		int n = 1, L = 0;
		while (n < 3 * a.size() + 3 * b.size()) n <<= 1, L++;
		FFT::init(n, L);
		A.resize(n), B.resize(n), C.resize(n);
		for (int i = 0; i < a.size(); i++) A[3 * i].real(a[i] % 1000);
		for (int i = 0; i < a.size(); i++) A[3 * i + 1].real(a[i] / 1000 % 1000);
		for (int i = 0; i < a.size(); i++) A[3 * i + 2].real(a[i] / 1000000);
		for (int i = 0; i < b.size(); i++) A[3 * i].imag(b[i] % 1000);
		for (int i = 0; i < b.size(); i++) A[3 * i + 1].imag(b[i] / 1000 % 1000);
		for (int i = 0; i < b.size(); i++) A[3 * i + 2].imag(b[i] / 1000000);
		FFT::DFT(A);
		for (int i = 0; i < n; i++) B[i] = conj(A[(n - i) % n]);
		for (int i = 0; i < n; i++) C[i] = (A[i] * A[i] - B[i] * B[i]) / (4.0 * complex<double>(0, 1));
		FFT::IDFT(C);
		ret.resize(n / 3 + 1);
		for (int i = 0; i < n; i += 3) ret.v[i / 3] += (long long)(C[i].real() + 0.5);
		for (int i = 1; i < n; i += 3) ret.v[i / 3] += (long long)(C[i].real() + 0.5) * 1000;
		for (int i = 2; i < n; i += 3) ret.v[i / 3] += (long long)(C[i].real() + 0.5) * 1000000;
		for (int i = 0; i < ret.size() - 1; i++) ret.v[i + 1] += ret.v[i] / R, ret.v[i] %= R;
		while (ret.size() && !ret[ret.size() - 1]) ret.v.pop_back();
		return ret;
	}

	Bigint multiply_abs_force(const Bigint &a, const Bigint &b) {
		Bigint ret;
		ret.resize(a.size() + b.size());
		for (int i = 0; i < a.size(); i++)
			for (int j = 0; j < b.size(); j++) {
				ret[i + j] += a[i] * b[j];
				if (ret[i + j] >= R2) ret[i + j + 1] += ret[i + j] / R, ret[i + j] %= R;
			}
		for (int i = 0; i < ret.size() - 1; i++) ret.v[i + 1] += ret.v[i] / R, ret.v[i] %= R;
		while (ret.size() && !ret[ret.size() - 1]) ret.pop_back();
		return ret;
	}

	Bigint multiply_abs_force(const Bigint &a, long long b) {
		Bigint ret;
		ret.resize(a.size() + 1);
		for (int i = 0; i < a.size(); i++) ret[i] += a[i] * b, ret.v[i + 1] += ret.v[i] / R, ret.v[i] %= R;
		while (ret.size() && !ret[ret.size() - 1]) ret.pop_back();
		return ret;
	}

	Bigint operator * (const Bigint &a, const Bigint &b) {
		Bigint ret;
		if ((long long) a.size() * b.size() < 40000) ret = multiply_abs_force(a, b);
		else ret = multiply_abs_fft(a, b);
		ret.sign = a.sign ^ b.sign;
		return ret;
	}

	Bigint operator ^ (const Bigint &a, long long b) {
		Bigint ret(1), tmp = a; 
		while(b) {
			if (b & 1) ret = ret * tmp;
			b /= 2, tmp = tmp * tmp;
		}
		return ret;
	}

	bool shift_cmp_abs(const Bigint &a, const Bigint &b, int x) {
		if (a.size() != b.size() + x) return a.size() < b.size() + x;
		for (int i = b.size() - 1; i >= 0; i--)
			if (a[i + x] != b[i]) return a[i + x] < b[i];
		return 0;
	}

	Bigint shift_minus_abs(const Bigint &a, const Bigint &b, int x) {
		Bigint ret = a;
		for (int i = 0; i < b.size(); i++) {
			ret.v[i + x] -= b[i];
			if (ret.v[i + x] < 0) ret.v[i + x + 1] -= 1, ret.v[i + x] += R;
		}
		while (ret.size() && !ret[ret.size() - 1]) ret.pop_back();
		return ret;
	}

	long long divide(unsigned long long x1, unsigned long long x0, long long y) {
		long long ret = 0;
		for (int i = 0; i < 2 * DIG; i++) {
			x0 *= 10, x1 *= 10;
			x1 += x0 / R2;
			x0 %= R2;
			ret = ret * 10 + x1 / y;
			x1 -= (x1 / y) * y;
		}
		return ret;
	}

	pair<Bigint, Bigint> divide_abs(const Bigint &a, const Bigint &b) {
		Bigint ret1, ret2;
		ret1.resize(max(0, a.size() - b.size() + 1));
		ret2 = a;
		long long y1 = b[b.size() - 1];
		long long y0 = b.size() - 2 >= 0 ? b[b.size() - 2] : 0;
		long long y = y1 * R + y0;
		for (int i = ret1.size() - 1; i >= 0; i--) {
			int j = i + b.size() - 1;
			long long x2 = j + 1 < ret2.size() ? ret2[j + 1] : 0;
			long long x1 = j < ret2.size() ? ret2[j] : 0;
			long long x0 = 0 <= j - 1 && j - 1 < ret2.size() ? ret2[j - 1] : 0;

			long long k = divide(x2, x1 * R + x0, y + 1);
			ret2 = shift_minus_abs(ret2, multiply_abs_force(b, k), i);
			if (!shift_cmp_abs(ret2, b, i)) ret2 = shift_minus_abs(ret2, b, i), k++;
			ret1[i] += k;
		}
		while (ret1.size() && !ret1[ret1.size() - 1]) ret1.pop_back();
		while (ret2.size() && !ret2[ret2.size() - 1]) ret2.pop_back();
		return make_pair(ret1, ret2);
	}

	Bigint operator / (const Bigint &a, const Bigint &b) {
		pair<Bigint, Bigint> ret = divide_abs(a, b);
		ret.first.sign = a.sign;
		return ret.first;
	}

	Bigint operator % (const Bigint &a, const Bigint &b) {
		pair<Bigint, Bigint> ret = divide_abs(a, b);
		ret.second.sign = a.sign;
		return ret.second;
	}
}

using myBigint::Bigint;
Bigint a, b;

int main() {
	cin.sync_with_stdio(0);
	cin.tie(0);
	cin >> a >> b;
	cout << a * b << endl;
	return 0;
}
