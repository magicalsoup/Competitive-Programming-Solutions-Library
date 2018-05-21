public int countHi(String str) {
if(str.length()<2) {
return 0;
}
if(str.length()==2){
if(str.equals("hi")) {
return 1;
}
return 0;
}
String b = str.substring(str.length()-2, str.length());
if(b.equals("hi")){
str = str.substring(0, str.length()-1);
return countHi(str)+1;
}
str = str.substring(0, str.length()-1);
return countHi(str); 
}
