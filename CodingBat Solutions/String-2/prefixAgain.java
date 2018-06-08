public boolean prefixAgain(String str, int n) {
  String s = str.substring(0,n);
  str = str.substring(n);
  if(str.contains(s))
  return true;
  return false;
}
