public boolean modThree(int[] nums) {
    if(nums.length < 3)
        return false;
          
    for(int i = 0; i <= nums.length - 3; i++) {
        if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
            return true;
    }
                          
    return false;
}
