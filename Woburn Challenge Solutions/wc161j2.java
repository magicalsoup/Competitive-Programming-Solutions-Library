import java.util.*;
public class wc161j2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b;
        while(a.indexOf(".")!=-1){
            b = a.substring(0,a.indexOf("."));
            if(!b.equals("Frankenstein")){
                System.out.print(b+".");
            }
            else{
                System.out.print("Frankenstein's.monster.");
            }
            a = a.substring(a.indexOf(".")+1,a.length());
        }
        if(a.equals("Frankenstein")){
            System.out.print("Frankenstein's.monster");
        }
        else{
            System.out.print(a);
        }
        
     }
}
