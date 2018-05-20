import java.util.*;
public class ccc08j2{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String arr[] = {"A","B","C","D","E"};
	while(true) {
		int first = sc.nextInt();
		int second = sc.nextInt();
		if(first==4&&second==1) {
			break;
		}
		if(first==1) {
			for(int i=0;i<second;i++) {
				String temp = "";
				 temp = arr[0]; 
				arr[0] = arr[1];
				arr[1] = arr[2];
				arr[2] = arr[3];
				arr[3] =  arr[4];
				arr[4] = temp;
				//System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
		}
		if(first ==2) {
			for(int i=0;i<second;i++) {
				String temp = "";
				temp = arr[4];
				arr[4] = arr[3];
				arr[3] = arr[2];
				arr[2] = arr[1];
				arr[1] = arr[0];
				arr[0] = temp;
				//System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
		}
		if(first==3) {
			for(int i=0;i<second;i++) {
				String temp = "";
				temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
				//System.out.print(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
			}
		}
	}
	for(int i=0;i<5;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
