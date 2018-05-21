public String[] wordsWithout(String[] words, String target) {
  int len =0;
  for(int i=0;i<words.length;i++){
    if(!words[i].equals(target))
    len++;
  }
  String ans[] = new String[len];
  int j = 0;
  for(int i=0;i<words.length&&j<len;i++){
    if(!words[i].equals(target)){
      ans[j] = words[i];
      j++;
    }
  }
  return ans;
}
