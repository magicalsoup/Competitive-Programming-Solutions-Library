import java.util.Scanner;
public class mccc19j4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B = sc.nextLong();
        long n = B-A+1;
        long sum = (A+B)*n/2;
        System.out.println(sum);
        sc.close();
    }
}
