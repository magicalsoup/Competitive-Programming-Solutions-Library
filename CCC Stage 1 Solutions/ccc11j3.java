import java.util.Scanner;
public class ccc11j3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int t = scan.nextInt();
int t1 = scan.nextInt();
int count =-1;
for(int i=0;i<10000;i++) {
	count++;
	int t3 = t-t1;
	t = t1;
	t1= t3;
	if(t3<0) {
		break;
	}
}
System.out.println(count+2);
	}
}
