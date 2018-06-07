public int count11(String str) {
  if(str.length()<2)
  return 0;
  if(str.substring(0,2).equals("11"))
  return 1+count11(str.substring(2));
  return count11(str.substring(1));
}
