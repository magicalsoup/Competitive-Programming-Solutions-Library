public boolean groupSum6(int start, int[] nums, int target) {
    if(start >= nums.length)
        return target == 0;
          
    if(nums[start] == 6)
        return groupSum6(start+1, nums, target - 6);
                    
    if(groupSum6(start+1, nums, target - nums[start]))
        return true;
                              
    if(groupSum6(start+1, nums, target))
        return true;
                                        
    return false;
}
