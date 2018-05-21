public Map<String, String> topping1(Map<String, String> map) {
  if(map.containsKey("ice cream"))
  map.put("ice cream","cherry");
  map.put("bread","butter");
  return map;
}
