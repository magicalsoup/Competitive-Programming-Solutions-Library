public int[] evenOdd(int[] nums) {
    int i = 0;
    
    while(i < nums.length && nums[i] % 2 == 0)
        i++;
              
    for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] % 2 == 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
    }
                                                    
    return nums;
}
