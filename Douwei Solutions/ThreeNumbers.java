package Douwei;
import java.util.*;
public class ThreeNumbers {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	int arr[] = new int[a];
	for(int i=0;i<a;i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	int cnt =0;
	for(int i=0;i<a;i++) {
		for(int j=i;j<a;j++) {
			for(int k=j;k<a;k++) {
				if(check(arr[i],arr[j],arr[k]))
					cnt++;
			}
		}
	}
	System.out.println(cnt);
}
public static boolean check(int x,int y,int z) {
	if((x<y)&&(y<z)) {
		if((y-x)<=(z-y)&&(z-y)<=2*(y-x)) {
			return true;
		}
	}
	return false;
}
}
