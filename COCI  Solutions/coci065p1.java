import java.util.Scanner;
public class coci065p1
{  
    public static void main(String args[])
    {
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       int ball = 1;
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(ball==1){
               if(c=='A'){
                   ball = 2;
               }
               else if(c=='B'){
                   ball = 1;
               }
               else if(c=='C'){
                   ball=3;
               }
           }
           else if(ball==2){
               if(c=='A'){
                   ball = 1;
               }
               else if(c=='B'){
                   ball = 3;
               }
               else if(c =='C'){
                   ball = 2;
               }
           }
           else if(ball==3){
               if(c=='A'){
                   ball = 3;
               }
               else if(c=='B'){
                   ball = 2;
               }
               else if(c =='C'){
                   ball = 1;
               }
           }
       }
       System.out.println(ball);
    }
}
