public int array11(int[] nums, int index) {
  int count =0 ;
    if(nums.length==0)
  return 0;
  if(nums[index]==11)
  count++;
  if(index==nums.length-1&&nums[index]!=11)
  return 0;
  if(index==nums.length-1&&nums[index]==11)
  return 1;
  index++;
  return count+array11(nums,index);
}
