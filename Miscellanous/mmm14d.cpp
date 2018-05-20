#include <algorithm>
#include <cstdio>
#include <cstring>
using namespace std;

int num[19], len;
long long DP[19][2][2][2][11][11][11][11][11];

long long solve(int pos, bool small, bool zero, bool more,
                int A, int B, int C, int D, int E) {
  long long &ret = DP[pos][small][zero][more][A][B][C][D][E];
  if (ret != -1) return ret;
  ret = 0;
  int limit = small ? num[pos] : 9;
  if (pos == len) {
    if (more)
      ret = limit + 1;
    else if (E <= limit)
      ret = limit - E + 1;
  } else {
    int nA = A, nB = B, nC = C, nD = D, nE = E;
    for (int i = 0; i <= limit; i++) {
      if (!zero || i > 0) {
        nA = min(A, i);
        nB = min(B, i >= A ? i : 10);
        nC = min(C, i >= B ? i : 10);
        nD = min(D, i >= C ? i : 10);
        nE = min(E, i >= D ? i : 10);
      }
      ret += solve(pos + 1, small && i == limit, zero && i == 0,
                   more || E <= i, nA, nB, nC, nD, nE);
    }
  }
  return ret;
}

void init(long long N) {
  if (N) init(N / 10);
  num[len++] = N % 10;
}

long long get(long long sub) {
  long long N;
  scanf("%lld", &N);
  N -= sub;
  len = 0;
  init(N);
  len--;
  memset(DP, -1, sizeof DP);
  return solve(0, 1, 1, 0, 10, 10, 10, 10, 10);
}

int main() {
  long long A = get(1);
  long long B = get(0);
  printf("%lld\n", B - A);
  return 0;
}
