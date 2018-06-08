public String oneTwo(String str) {
    String str2 = "";
    for(int i=0; i<str.length()-2; i+=3) {
        str2 = str2+str.substring(i+1,i+3)+str.charAt(i);
    }
    return str2;
}
