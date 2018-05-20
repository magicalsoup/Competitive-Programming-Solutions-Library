package Douwei;
import java.util.*;
public class Functions {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(f(n)+" "+g(n));
        }
    }
    public static int f(int n){
        if(n==1)return 1;
        return n+f(n-1);
    }
    public static int g(int n){
        if(n==0)return 0;
        if(n-1==0)return 1;
        return f(n)+g(n-1);
    }
}