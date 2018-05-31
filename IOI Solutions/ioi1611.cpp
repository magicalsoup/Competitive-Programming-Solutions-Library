#include <bits/stdc++.h>

int *w;

int comp(void const *x, void const *y) {
  return w[*(int*)x] - w[*(int*)y];
}

int id[1234567];

int find_subset(int l, int u, int *w_, int n, int *res) {
  w = w_;
  for (int i = 0; i < n; i++) id[i] = i;
  qsort(id, n, sizeof(int), comp);
  int i = 0;
  long long sum = 0;
  while (i < n && sum + w[id[i]] <= u) {
    sum += w[id[i++]];
  }
  if (sum >= l) {
    for (int j = 0; j < i; j++) res[j] = id[j];
    return i;
  } else {
    int j = 0;
    while (i + j < n && sum < l) {
      sum += w[id[i + j]] - w[id[j]];
      j++;
    }
    if (sum < l) {
      return 0;
    } else {
      for (int t = 0; t < i; t++) {
        res[t] = id[t + j];
      }
      return i;
    }
  }
}


// BEGIN CUT
int main() {
    int n, l, u;
    scanf("%d %d %d", &n, &l, &u);
    int* w = (int*)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++)
        scanf("%d", &w[i]);
    int* result = (int*)malloc(n * sizeof(int));
    int result_len = find_subset(l, u, w, n, result);

    // Intended behavior is that contestant gets WA if he returns an incorrect array length.
    printf("%d\n", result_len);
    if (0 <= result_len && result_len <= n) {
        for (int i = 0; i < result_len; i++)
            printf("%d ", result[i]);
        printf("\n");
    } 
}
