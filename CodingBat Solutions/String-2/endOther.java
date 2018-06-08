public boolean endOther(String a, String b) {
    if(a.length() < b.length()) {
        String temp = a;
        a = b.toLowerCase();
        b = temp.toLowerCase();
    }
                  
    return a.substring(a.length() - b.length()).equals(b);
}
