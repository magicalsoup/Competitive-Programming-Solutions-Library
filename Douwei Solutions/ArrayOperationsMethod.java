package Douwei;
import java.util.*;
public class ArrayOperationsMethod{
    public static void main(String[]args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int m = sc.nextInt();
        while(m-->0) {
            String str = sc.next();
            if(str.equals("SWAPONE")) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                swapone(a,b,arr);
            }
            if(str.equals("SWAPTWO")) {
                swaptwo(arr);
            }
            if(str.equals("SWAPTHREE")) {
                swapthree(arr,n);
            }
            if(str.equals("SWAPFOUR")) {
                swapfour(arr,n);
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
public static void swapone(int a,int b,int arr[]) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
public static void swaptwo(int arr[]) {
    for(int i=0;i<arr.length-1;i+=2) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
public static void swapthree(int arr[],int n) {
    for(int i=0;i<n/2;i++) {
        int temp = arr[i];
        arr[i] = arr[n/2+i];
        arr[n/2+i] = temp;
    }
}
public static void swapfour(int arr[],int n) {
    int t =1;
    for(int i=0;i<n/2;i++) {
        int temp = arr[i];
        arr[i] = arr[n-t];
        arr[n-t] = temp;
        t++;
    }
}
}