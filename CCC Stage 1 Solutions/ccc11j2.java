import java.util.Scanner;
public class ccc11j2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int h = scan.nextInt();
int m = scan.nextInt();
int hour = 0;
for(int i=1;i<=240;i++) {
	int a = (i*i*i*i)*-6+h*(i*i*i)+2*(i*i)+i;
	if(a<=0) {
		hour =i;
		break;
	}
}
if(hour<=m) {
System.out.println("The balloon first touches ground at hour: ");
System.out.println(hour);
}	
else {
	System.out.println("The balloon does not touch ground in the given time.");
}
}
}
