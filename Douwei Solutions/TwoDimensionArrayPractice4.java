package Douwei;
import java.util.*;
public class TwoDimensionArrayPractice4{
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int r=  sc.nextInt();
    int c = sc.nextInt();
    double arr[] = new double[r*c];
    double abs =0;
    double ans1 =0;
    double ans2 =0;
    double max = Double.MAX_VALUE;
    for(int x=0;x<r*c;x++) {
    arr[x] = sc.nextDouble();
    }
    Arrays.sort(arr);
    for(int i=0;i<r*c-1;i++) {
            abs = Math.abs(arr[i]-arr[i+1]);
            if(abs<max) {
                max = abs;
                ans1 = arr[i];
                ans2 = arr[i+1];
        }
    }
    System.out.println(String.format("%.2f",Math.min(ans1,ans2))+" "+String.format("%.2f", Math.max(ans1,ans2))+" "+String.format("%.2f", Math.abs(ans1-ans2)));
}
}