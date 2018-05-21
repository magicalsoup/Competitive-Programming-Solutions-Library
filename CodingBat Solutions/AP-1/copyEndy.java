public int[] copyEndy(int[] nums, int count) {
  int arr[] = new int[count];
  int j=0;
  for(int i=0;i<nums.length&&j<count;i++){
    if(nums[i]>=0&&nums[i]<=10||nums[i]>=90&&nums[i]<=100){
      arr[j] = nums[i];
      j++;
    }
  }
  return arr;
}
