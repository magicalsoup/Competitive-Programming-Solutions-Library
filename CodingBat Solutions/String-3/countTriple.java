public int countTriple(String str) {
    int count = 0;
    
    for(int i = 0; i <= str.length() - 3; i++) {
        if(str.charAt(i) == str.charAt(i+1) && 
            str.charAt(i) == str.charAt(i+2))
            count++;
    }
                    
    return count;
}
