public Map<String, Integer> wordCount(String[] strings) {
  Map<String,Integer> map = new HashMap<String, Integer>();
  String arr[] = new String[strings.length];
  for(int i=0;i<strings.length;i++){
    int count = 0;
    for(int j=0;j<strings.length;j++){
    if(arr[i].equals(arr[j])){
      count++;
    map.put(arr[i],count);
    }
  }
  }
  return map;
}
