public String repeatEnd(String str, int n) {
  String res = "";
  for(int i=0;i<n;i++){
    res+=str.substring(str.length()-n);
  }
  return res;
}
