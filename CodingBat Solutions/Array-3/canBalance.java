public boolean canBalance(int[] nums) {
    int first = 0;
    int second = 0;
      
    for(int i = 0; i < nums.length; i++)
        second += nums[i];
              
    for(int i = 0; i <= nums.length - 2; i++) {
        first += nums[i];
        second -= nums[i];
                            
        if(first == second)
            return true;
    }
                                          
    return false;
}
