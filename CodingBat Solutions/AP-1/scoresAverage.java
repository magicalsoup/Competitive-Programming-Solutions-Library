public int scoresAverage(int[] scores) {
  int sum =0;
  int times =0;
  for(int i=0;i<scores.length/2;i++){
    sum+=scores[i];
    times++;
  }
  int max1 = sum/times;
  sum = 0;
  times =0;
    for(int i=scores.length/2;i<scores.length;i++){
    sum+=scores[i];
    times++;
  }
  int max2 = sum/times;
  return Math.max(max1,max2);
}
