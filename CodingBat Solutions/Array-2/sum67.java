public int sum67(int[] nums) {
  int sum =0;
  if(nums.length==0)
    return 0;
    boolean block = false;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==6){
        block = true;
      }
     else if(nums[i]==7&&block){
        block = false;
      }
      else if(!block)
      sum+=nums[i];
    }
  return sum;
}
