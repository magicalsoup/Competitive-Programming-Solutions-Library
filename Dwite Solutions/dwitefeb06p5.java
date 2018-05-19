import java.util.*;
public class dwitefeb06p5{
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        for(int j=0;j<5;j++)
        {
            int a =scan.nextInt();
            int b = scan.nextInt();
            int count =0;
            for(int i =a ;a<=b;a++)
                if(prime(a)&&palindrome(a))
                    count++;
            System.out.println(count);
        }
     }
     public static boolean prime(int i){
     if(i<=1)return false;
     if(i==2||i==3)return true;
     if(i%2==0||i%3==0)return false;
         for(int j=6;j<=Math.sqrt(i)+1;j+=6)
             if(i%(j-1)==0||i%(j+1)==0)
             return false;
         return true;
     }
     public static boolean palindrome(int i){
         if(i<10) return true;
         String s= Integer.toString(i);
         
         boolean flag = true;
         for(int j=0;j<(s.length()+1)/2;j++){
             if(s.charAt(j)!=s.charAt(s.length()-j-1)) return false;
         }
         return true;
     }
}
