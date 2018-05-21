public int scoresSpecial(int[] a, int[] b) {
  return find(a)+find(b);
}
public  int find(int []a){
  int max =0 ;
  for(int i=0;i<a.length;i++){
    if(a[i]%10==0){
      if(a[i]>max)
      max = a[i];
    }
  }
  return max;
}
