package Douwei;
import java.util.*;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(solve(a));
        sc.close();
    }
    static int solve(int a){
        if( a == 2) return 1;
        if( a == 3) return 1;
        if( a < 2) return 0;
        return solve(a - 2) + solve(a - 3);
    }
}
