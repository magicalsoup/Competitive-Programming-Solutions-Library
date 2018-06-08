public int[] pre4(int[] nums) {
    int i = 0;
    
    while(nums[i] != 4)
        i++;
              
    int[] arr = new int[i];
                  
    for(int j = 0; j < i; j++)
        arr[j] = nums[j];
                            
    return arr;
}
