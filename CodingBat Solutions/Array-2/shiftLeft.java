public int[] shiftLeft(int[] arr) {
  for(int i=1;i<arr.length;i++){
    int temp = arr[i-1];
    arr[i-1] = arr[i];
    arr[i] = temp; 
  }
  return arr;
}
