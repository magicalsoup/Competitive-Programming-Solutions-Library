public int[] squareUp(int n) {
    int[] arr = new int[n*n];
    
    if(n == 0)
        return arr;
              
    for(int i = n - 1; i < arr.length; i += n) {
        for(int j = i; j >= i - i / n; j--)
            arr[j] = i - j + 1;
    }
                              
    return arr;
}
