import java.util.Scanner;
public class tc1p1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- >0){
            String com = sc.next();
            double x = sc.nextDouble(), y = sc.nextDouble();
            if(com.equals("ADD"))
                System.out.printf("%.0f\n", Math.floor(x+y));
            if(com.equals("SUB"))
                System.out.printf("%.0f\n", Math.floor(x-y));
            if(com.equals("MUL"))
                System.out.printf("%.0f\n", Math.floor(x*y));
            if(com.equals("DIV"))
                System.out.printf("%.0f\n", Math.floor(x/y));
        }
        sc.close();
    }
}
