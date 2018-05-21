public Map<String, String> pairs(String[] strings) {
  Map<String,String> map = new HashMap<String,String>();
  for(String s:strings){
    char t = s.charAt(0);
    char t1 = s.charAt(s.length()-1);
    String res = "";
    String res2 = "";
    res+=t;
    res2+=t1;
    map.put(res,res2);
    res = "";
    res2 = "";
  }
  return map;
}
