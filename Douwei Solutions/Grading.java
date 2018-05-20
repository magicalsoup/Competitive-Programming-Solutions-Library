package Douwei;
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=0;i<a;i++) {
    int p = sc.nextInt();
    int t= sc.nextInt();
    int g1 = sc.nextInt();
    int g2 = sc.nextInt();
    int g3=  sc.nextInt();
    int gj= sc.nextInt();
    if(g1-g2<=t) {
    	System.out.println((g1+g2)/2.0);
    }
    else if(g1-g3<=t&&!(g2-g3<=t)||!(g1-g3<=t)&&g2-g3<=t) {
    if(g3-g1>g3-g2)
    	System.out.println((g3+g2)/2.0);
    else
    	System.out.println((g3+g1)/2.0);
    }
    else if(g1-g3<=t&&g2-g3<=t) {
    	System.out.println(Math.max(g1, Math.max(g2, g3)));
    }
    else {
    	System.out.println(gj);
    }
}
    }
}