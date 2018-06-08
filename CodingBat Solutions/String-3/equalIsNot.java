public boolean equalIsNot(String str) {
  int not = 0;
  int is = 0;
  for(int i=0;i<str.length()-2;i++){
    if(str.substring(i,i+3).equals("not"))
    not++;
  }
  for(int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+2).equals("is"))
    is++;
  }
  return not==is;
}
