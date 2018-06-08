public int roundSum(int a, int b, int c) {
  int sum = round(a)+round(b)+round(c);
  return sum;
}
public int round(int a){
  double s = a/10.0;
  double t = Math.round(s);
  return (int)(t*10);
}
