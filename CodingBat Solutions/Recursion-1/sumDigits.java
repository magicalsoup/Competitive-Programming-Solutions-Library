public int sumDigits(int n) {
  int sum = 0;
  sum+=n%10;
  if(n<10)return n;
  else
  n/=10;
  return sumDigits(n)+sum;
}
