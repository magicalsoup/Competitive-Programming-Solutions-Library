public boolean lucky13(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1||nums[i]==3)
    return false;
  }
  return true;
}
