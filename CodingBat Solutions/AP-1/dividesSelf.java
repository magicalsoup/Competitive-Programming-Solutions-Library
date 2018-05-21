public boolean dividesSelf(int n) {
  int t = n;
  while(n>0){
    if(n%10==0)
    return false;
    if(t%(n%10)!=0)
    return false;
    n/=10;
  }
  return true;
}
