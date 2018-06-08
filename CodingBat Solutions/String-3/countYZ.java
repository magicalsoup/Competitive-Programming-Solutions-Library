public int countYZ(String str) {
    if(str.length() == 0)
        return 0;
        
    int count = 0;  
            
    for(int i = 0; i <= str.length() - 2; i++) {
        if((Character.toLowerCase(str.charAt(i)) == 'y' || 
            Character.toLowerCase(str.charAt(i)) == 'z') &&
            !Character.isLetter(str.charAt(i+1)))
            count++;
    }
                                        
    if(Character.toLowerCase(str.charAt(str.length() - 1)) == 'y' ||
        Character.toLowerCase(str.charAt(str.length() - 1)) == 'z')
        count++;
                                                    
    return count;
}
