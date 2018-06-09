public String noX(String str) {
if(str.length()==0)
  return str;
  if(str.substring(0,1).equals("x"))
  return ""+noX(str.substring(1));
  return str.charAt(0)+noX(str.substring(1));
}
