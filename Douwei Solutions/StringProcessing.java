package Douwei;
import java.util.*;
public class StringProcessing{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    while(true) {
    String str = sc.next();
    if(str.equals("0"))
        break;  
    str = str.toUpperCase();
    int sum =0;
    boolean fail = false;
    for(int i=0;i<str.length();i++) {
        char c = str.charAt(i);
        if(Character.isAlphabetic(c)) {
            sum+= c-'A'+1;
        }
        else {
            fail = true;
        }
    }
    if(!fail)
        System.out.println(sum +" ");
    else
        System.out.println("Fail");
    }
}
}