public int[] fizzArray3(int start, int end) {
    int arr[] = new int[end-start];
    for(int i=0;i<arr.length;i++){
    arr[i] = start;
      start++;
    }
    return arr;
}
