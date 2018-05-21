public int[] copyEvens(int[] nums, int count) {
  int arr[] = new int[count];
  int j =0;
  for(int i=0;i<nums.length&&j<count;i++){
    if(nums[i]%2==0){
      arr[j] = nums[i];
      j++;
    }
  }
  return arr;
}
