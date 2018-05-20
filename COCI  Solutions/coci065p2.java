import java.util.*;
public class coci065p2{
     public static void main(String []args){
    	@SuppressWarnings("resource")
     Scanner scan = new Scanner(System.in);
        String[]s1 = scan.nextLine().split(":");
        String[] s2 = scan.nextLine().split(":");
        int a = Integer.parseInt(s2[0])-Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s2[1]) -Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s2[2]) - Integer.parseInt(s1[2]);
        if(c<0){
            c+=60;
            b--;
        }
        if(b<0){
            b+=60;
            a--;
        }
        if(a<0){
            a+=24;
        }
        if(a==0&&b==0&&c==0)
        a = 24;
        System.out.printf("%02d:%02d:%02d",a,b,c);
     }
}
