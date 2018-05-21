public Map<String, String> mapAB(Map<String, String> map) {
  if(map.containsKey("a")&&map.containsKey("b")){
    map.put("ab",map.get("a")+map.get("b"));
  }
  return map;
}
