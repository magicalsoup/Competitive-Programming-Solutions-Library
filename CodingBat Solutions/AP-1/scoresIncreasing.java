public boolean scoresIncreasing(int[] scores) {
  boolean bool = true;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i]<=scores[i+1])
    continue;
    else{
      bool = false;
      break;
    }
  }
  return bool;
}
