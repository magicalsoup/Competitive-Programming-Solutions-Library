#include<bits/stdc++.h>
using namespace std;
const int base = 1000000000;
const int base_digits = 9;
struct bigint {
	vector<int> a;
	int sign;

	/*<arpa>*/
	int size() {
		if (a.empty())return 0;
		int ans = (a.size() - 1) * base_digits;
		int ca = a.back();
		while (ca)
			ans++, ca /= 10;
		return ans;
	}

	/*</arpa>*/
	bigint() :
			sign(1) {
	}

	bigint(long long v) {
		*this = v;
	}


	void operator=(const bigint &v) {
		sign = v.sign;
		a = v.a;
	}

	void operator=(long long v) {
		sign = 1;
		a.clear();
		if (v < 0)
			sign = -1, v = -v;
		for (; v > 0; v = v / base)
			a.push_back(v % base);
	}

	bigint operator+(const bigint &v) const {
		if (sign == v.sign) {
			bigint res = v;

			for (int i = 0, carry = 0; i < (int) max(a.size(), v.a.size()) || carry; ++i) {
				if (i == (int) res.a.size())
					res.a.push_back(0);
				res.a[i] += carry + (i < (int) a.size() ? a[i] : 0);
				carry = res.a[i] >= base;
				if (carry)
					res.a[i] -= base;
			}
			return res;
		}
		return *this - (-v);
	}

	bigint operator-(const bigint &v) const {
		if (sign == v.sign) {
			if (abs() >= v.abs()) {
				bigint res = *this;
				for (int i = 0, carry = 0; i < (int) v.a.size() || carry; ++i) {
					res.a[i] -= carry + (i < (int) v.a.size() ? v.a[i] : 0);
					carry = res.a[i] < 0;
					if (carry)
						res.a[i] += base;
				}
				res.trim();
				return res;
			}
			return -(v - *this);
		}
		return *this + (-v);
	}
    bool isZero() const {
        return a.empty() || (a.size() == 1 && !a[0]);
    }
    bigint abs() const {
        bigint res = *this;
        res.sign *= res.sign;
        return res;
    }
    bool operator<(const bigint &v) const {
        if (sign != v.sign)
            return sign < v.sign;
        if (a.size() != v.a.size())
            return a.size() * sign < v.a.size() * v.sign;
        for (int i = a.size() - 1; i >= 0; i--)
            if (a[i] != v.a[i])
                return a[i] * sign < v.a[i] * sign;
        return false;
    }

    bool operator>(const bigint &v) const {
        return v < *this;
    }
    bool operator<=(const bigint &v) const {
        return !(v < *this);
    }
    bool operator>=(const bigint &v) const {
        return !(*this < v);
    }
    bool operator==(const bigint &v) const {
        return !(*this < v) && !(v < *this);
    }
    bool operator!=(const bigint &v) const {
        return *this < v || v < *this;
    }

    void trim() {
        while (!a.empty() && !a.back())
            a.pop_back();
        if (a.empty())
            sign = 1;
    }



    bigint operator-() const {
        bigint res = *this;
        res.sign = -sign;
        return res;
    }
    friend ostream& operator<<(ostream &stream, const bigint &v) {
        if (v.sign == -1)
            stream << '-';
        stream << (v.a.empty() ? 0 : v.a.back());
        for (int i = (int) v.a.size() - 2; i >= 0; --i)
            stream << setw(base_digits) << setfill('0') << v.a[i];
        return stream;
    }
};

bigint dp[201];
void init(){
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    for(int i=3; i<= 201; i++)
        dp[i] = dp[i-1] + dp[i-2];
}
int main() {
    init();
    int x;
    while(true){
        cin>>x;
        if(x == 0) break;
        cout<<dp[x]<<endl;
    }
}
