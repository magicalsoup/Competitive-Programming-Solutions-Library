public int[] notAlone(int[] nums, int val) {
    int[] arr = new int[nums.length];
    
    if(nums.length >= 1) {
        arr[0] = nums[0];
        arr[arr.length-1] = nums[nums.length-1];
    }
                  
    for(int i = 1; i <= nums.length - 2; i++) {
        if(nums[i] == val && nums[i] != nums[i-1] && nums[i] != nums[i+1])
            arr[i] = Math.max(nums[i-1], nums[i+1]);
        else
            arr[i] = nums[i];
    }
                                            
    return arr;
}
