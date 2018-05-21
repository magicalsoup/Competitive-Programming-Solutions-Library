public boolean array6(int[] nums, int index) {
  if(nums.length==0)
  return false;
  if(nums[index]==6)
  return true;
  if(index==nums.length-1)
  return false;
  index++;
  return array6(nums,index);
}
