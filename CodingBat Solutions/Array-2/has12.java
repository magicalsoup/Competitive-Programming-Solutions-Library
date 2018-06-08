public boolean has12(int[] nums) {
    boolean found1 = false;
    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 1)
            found1 = true;
                    
        if(found1 && nums[i] == 2)
            return true;
    }
                                  
    return false;  
}
