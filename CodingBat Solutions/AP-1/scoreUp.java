public int scoreUp(String[] key, String[] answers) {
  int count =0;
  for(int i=0;i<answers.length;i++){
    if(answers[i].equals("?"))
      count+=0;
      else if(!key[i].equals(answers[i]))
      count-=1;
      else if(key[i].equals(answers[i]))
      count+=4;
  }
  return count;
}
