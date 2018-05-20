
import java.util.Scanner;
public class coci074p1{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int a =scan.nextInt();
	int b =scan.nextInt();
	int c =scan.nextInt();
	int d =scan.nextInt();
for(int i=0;i<3;i++) {
	int man = scan.nextInt();
	if(man%(a+b)<=a&&man%(a+b)>0&&man%(c+d)<=c&&man%(c+d)>0) {
		System.out.println("both");
	}
	else if((man%(a+b)<=a&&man%(a+b)>0)||(man%(c+d)<=c&&man%(c+d)>0)) {
		System.out.println("one");
	}
	else {
		System.out.println("none");
	}
}
	
}
}
