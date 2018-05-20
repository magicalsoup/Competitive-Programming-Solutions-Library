import java.util.*;
public class liljami {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int arr[] = new int[1000000];
	while(k-->0) {
		int ki = sc.nextInt();
		arr[ki]++;
	}
	for(int i=1;i<n;i++)
	{
		arr[i] +=arr[i-1];
	}
	int q = sc.nextInt();
	while(q-->0) {
		int a =  sc.nextInt();
		int b = sc.nextInt();
		if(a==0)
			System.out.println(arr[b]);
		else
			System.out.println(arr[b]-arr[a-1]);
	}
}
}
