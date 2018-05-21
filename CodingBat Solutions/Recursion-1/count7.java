public int count7(int n) {
int sum = 0;
if(n==0)
return 0;
if(n%10==7)
sum++;
if(n<10&&n==7)return 1;
else
  n/=10;
  return count7(n)+sum;
}
