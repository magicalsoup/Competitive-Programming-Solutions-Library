public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String,String>();
  for(int i=0;i<strings.length;i++){
    String t = strings[i].charAt(0)+"";
    if(map.containsKey(t)){
     map.put(t,map.get(t)+strings[i]); 
    }
    else
    map.put(t,strings[i]);
  }
  return map;
}
