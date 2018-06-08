public String mirrorEnds(String string) {
    StringBuilder result = new StringBuilder();
    
    for(int i = 0; i < string.length(); i++) {
        if(string.charAt(i) == string.charAt(string.length() - i - 1))
            result.append(string.charAt(i));
        else
            break;
    }
                              
    return result.toString();
}
