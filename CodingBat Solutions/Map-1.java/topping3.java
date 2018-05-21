public Map<String, String> topping3(Map<String, String> map) {
  if(map.containsKey("potato"))
  map.put("fries",map.get("potato"));
  if(map.containsKey("salad"))
  map.put("spinach",map.get("salad"));
  return map;
}
