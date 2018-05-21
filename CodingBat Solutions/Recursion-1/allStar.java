public String allStar(String str) {
 	if(str.length()<=0){
 	 return "";
 	}
 	if(str.length()-1<=0) {
str = str.substring(str.length()-1, str.length());
return str;
}
String t = str.substring(str.length()-1, str.length());
str = str.substring(0, str.length()-1);
return allStar(str)+"*"+t;
}
