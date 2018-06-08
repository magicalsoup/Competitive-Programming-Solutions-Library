public String doubleChar(String str) {
  String res = "";
  for(int i=0;i<str.length();i++){
    res+=str.charAt(i)+""+str.charAt(i)+"";
  }
  return res;
}
