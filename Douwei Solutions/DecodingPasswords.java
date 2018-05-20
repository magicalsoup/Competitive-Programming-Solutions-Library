package Douwei;
import java.util.*;
 public class DecodingPasswords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++){
            String str=sc.nextLine();
            for(int k=0;k<6;k++){
                System.out.print(Math.abs(str.charAt(k)-str.charAt(k+1)));
            }
            System.out.println();
        }
    }
}