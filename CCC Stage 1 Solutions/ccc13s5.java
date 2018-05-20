import java.util.*;
public class ccc13s5 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int cost =0;
	while(num>1) {
		int a =2;
		int b = (int)Math.sqrt(num)+1;
		while(a<=b&&num%a!=0) {
			a++;
		}
		if(a<num&&num%a==0) {
			int c =num/a;
			num-=c;
			cost+=num/c;
		}
		else {
			num--;
			cost+=num;
		}
	}
	System.out.println(cost);
}
}
