public boolean scores100(int[] scores) {
  boolean bool = true;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i]==scores[i+1]&&scores[i]==100){
      return true;
    }
  }
  return false;
}
