public String repeatSeparator(String word, String sep, int count) {
  String res = "";
  if(count==0)
  return "";
  for(int i=0;i<count-1;i++){
    res+=word;
    res+=sep;
  }
  res+=word;
  return res;
}
