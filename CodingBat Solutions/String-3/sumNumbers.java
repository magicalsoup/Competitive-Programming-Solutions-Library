public int sumNumbers(String str) {
    int sum = 0;
    int i = 0;
    int begin;
    int end;
          
    while(i < str.length() && !Character.isDigit(str.charAt(i)))
        i++;
                    
    begin = i;
    end = i;
                          
    while(i < str.length()) {
        if(!Character.isDigit(str.charAt(i))) {
            sum += Integer.parseInt(str.substring(begin, end));
            while(i < str.length() && !Character.isDigit(str.charAt(i)))
                i++;
                                                            
            begin = i;
            end = i;
        } else {
            end++;
            i++;
        }
    }
                                                                                                
    if(end > begin)
        sum += Integer.parseInt(str.substring(begin, end));
                                                                                                        
    return sum;
}
