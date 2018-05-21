public boolean array220(int[] nums, int index) {
    if(nums.length==0)
  return false;
  if(index!=nums.length-1){
  if(nums[index]*10==nums[index+1])
  return true;
  }
  if(index==nums.length-1)
  return false;
  index++;
  return array220(nums,index);
}
