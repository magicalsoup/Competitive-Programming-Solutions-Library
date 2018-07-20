import java.io.*;
import java.util.*;
public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(Integer i: ar)
            sum+=i;
        return sum;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ar[] = new int[a];
        for(int i=0;i<a;i++)
            ar[i] = sc.nextInt();
        System.out.println(simpleArraySum(ar));
        sc.close();
    }
}
