public String allStar(String str) {
  if(str.length()==0)
  return "";
str = str.replaceAll("","*");
String res = "";
for(int i=1;i<str.length()-1;i++){
  res+=str.charAt(i);
}
return res;
}
