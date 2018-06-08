public String wordEnds(String str, String word) {
    StringBuffer result = new StringBuffer();
    int i = 0;
      
    if(str.length() >= word.length() + 1 && 
        str.substring(0, word.length()).equals(word)) {
        i = word.length() - 1;
        result.append(str.charAt(i + 1));
    }
                        
    while(i < str.length() - word.length()) {
        if(str.substring(i + 1, i + 1 + word.length()).equals(word)) {
            result.append(str.charAt(i));
            i = i + word.length();
            if(i < str.length() - 1) {
                result.append(str.charAt(i + 1));
            }
        } else {
            i++;
        }
    }
                                                                                
    return result.toString();
}
