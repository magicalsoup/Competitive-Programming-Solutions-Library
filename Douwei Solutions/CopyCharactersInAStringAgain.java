package Douwei;
import java.util.*;
public class CopyCharactersInAStringAgain{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int t = sc.nextInt();
        int count = 1;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            for(int j=0;j<count;j++){
                System.out.print(c);
            }
            if(count==t)
            count = 0;
            count++;
        }
     }
}