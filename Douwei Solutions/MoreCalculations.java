package Douwei;
import java.util.*;
public class MoreCalculations{
    public static int ADD(int num){
        String str = num+"";
        int sum = 0;
        for(int i=0; i<str.length(); i=i+1){
            sum = sum + (str.charAt(i)-'0');
        }
     
        return sum;
    }
     
    public static int MULTIPLY(int num){
        String str = num+"";
        int product = 1;
        for(int i=0; i<str.length(); i=i+1){
            product = product * (str.charAt(i)-'0');
        }
     
        return product;
    }
     
    public static int MINUS( int num){
        String str = num+"";
        int minus = 0;
        for( int i=0; i<str.length(); i=i+2){
            minus = minus + (str.charAt(i) - '0');
            minus = minus - (str.charAt(i+1) - '0');
        }
         
        return minus;
    }
     
    public static int SQUARE( int num){
        String str = num+"";
        int square = 0;
        for(int i=0; i<str.length(); i=i+1){
            square = square + (str.charAt(i)-'0')*(str.charAt(i)-'0');
        }
     
        return square;
    }
     
    public static int CUBE(int num){
        String str = num+"";
        int cube = 0;
        for(int i=0; i<str.length(); i=i+1){
            cube = cube + (str.charAt(i)-'0') * (str.charAt(i)-'0') * (str.charAt(i)-'0');
        }
     
        return cube;
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(count<n){
            String command = sc.next();
            int num = sc.nextInt();
             
            if(command.equals("ADD")){
                System.out.println(ADD(num));
            }
            if(command.equals("MULTIPLY")){
                    System.out.println(MULTIPLY(num));
            }
            if(command.equals("MINUS")){
                    System.out.println(MINUS(num));
            }
            if(command.equals("SQUARE")){
                    System.out.println(SQUARE(num));
            }
            if(command.equals("CUBE")){
                    System.out.println(CUBE(num));
            }
            count = count +1;
        }
    }
}