public String repeatFront(String str, int n) {
  String res = "";
  for(int i=n;i>=0;i--){
    res+=str.substring(0,i);
  }
  return res;
}
