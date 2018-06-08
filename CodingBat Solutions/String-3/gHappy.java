public boolean gHappy(String str) {
    if(str.length() == 1 && str.charAt(0) == 'g')
        return false;
          
    if(str.length() >= 2 &&
        (str.charAt(0) == 'g' && str.charAt(1) != 'g' ||
        str.charAt(str.length()-1) == 'g' && 
        str.charAt(str.length()-2) != 'g'))
        return false;
                          
    for(int i = 1; i <= str.length() - 2; i++) {
        if(str.charAt(i) == 'g' && str.charAt(i-1) != 'g' && 
            str.charAt(i+1) != 'g')
            return false;
    }
                                          
    return true;
}
