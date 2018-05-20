package Douwei;
import java.util.Scanner;
public class SumAgainMap {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
int w = sc.nextInt();
int arr[] = new int[t];
int ans[] = new int[w];
for(int i=0;i<t;i++) {
	arr[i] = sc.nextInt();
}
for(int i=0;i<t;i++) {
	ans[arr[i]%w]+=arr[i];
}
while(w-->0) {
	int b = sc.nextInt();
	System.out.println(ans[b]);
}
}
}
