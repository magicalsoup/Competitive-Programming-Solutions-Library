public boolean split53(int[] nums) {
    return split53Helper(0, nums, 0, 0);
}

public boolean split53Helper(int start, int[] nums, int mult5, int mult3) {
    if(start >= nums.length)
        return mult5 == mult3;
            
    if(nums[start] % 5 == 0)
        return split53Helper(start+1, nums, mult5 + nums[start], mult3);
                      
    if(nums[start] % 3 == 0)
        return split53Helper(start+1, nums, mult5, mult3 + nums[start]);
                                
    if(split53Helper(start+1, nums, mult5 + nums[start], mult3))
        return true;
                                          
    if(split53Helper(start+1, nums, mult5, mult3 + nums[start]))
        return true;
                                                    
    return false;
}
