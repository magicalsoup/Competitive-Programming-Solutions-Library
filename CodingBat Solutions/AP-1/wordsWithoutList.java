public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> list = new ArrayList<String>();
  for(int i=0;i<words.length;i++){
    if(words[i].length()!=len)
    list.add(words[i]);
  }
  return list;
}
