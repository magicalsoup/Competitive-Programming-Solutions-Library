public int[] post4(int[] nums) {
    int i = nums.length - 1;
    
    while(nums[i] != 4)
        i--;
              
    int[] arr = new int[nums.length - i - 1];
                  
    for(int j = 0; j < arr.length; j++)
        arr[j] = nums[i + j + 1];
                          
    return arr;
}
