package Douwei;
import java.util.*;
public class SolvingEquations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,e,f;
        double x,y;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
         
        if((double)(a/d) == (double)(b/e) && (double)(c/f) == (double)(b/e) ){
            System.out.println("Too Many");
        }
        else{
            if(d-(a*e/b) ==0){
                System.out.println("No answer");
            }
            else{
            x = (f-(c*e/b))/(d-(a*e/b));
            System.out.printf("x=%.2f",x);
            y = (c-a*x)/b;
            System.out.println();
            System.out.printf("y=%.2f",y);
            }
        }
    }
}