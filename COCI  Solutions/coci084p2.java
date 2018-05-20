import java.util.Scanner;
public class coci084p2{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int b1=0;
	a = a-1;
	if(b==1) {
		b1= 0;
	}
	else if(b==2) {
		b1=31;
	}
	else if(b==3) {
		b1=59;
	}
	else if(b==4) {
		b1=90;
	}
	else if(b==5) {
		b1=120;
	}
	else if(b==6) {
		b1=151;
	}
	else if(b==7) {
		b1=181;
	}
	else if(b==8) {
		b1=212;
	}
	else if(b==9) {
		b1=243;
	} 
	else if(b==10) {
	b1=273;
	}
	else if(b==11) {
	b1=304;	
	}
	else if(b==12) {
		b1=334;
	}
	if((a+b1)%7==0) {
		System.out.println("Thursday");
	}
	 if((a+b1)%7==1) {
		System.out.println("Friday");
	}
	 if((a+b1)%7==2) {
		System.out.println("Saturday");
	}
	 if((a+b1)%7==3) {
		System.out.println("Sunday");
		}
	else if((a+b1)%7==4) {
		System.out.println("Monday");
	}
	else if((a+b1)%7==5) {
		System.out.println("Tuesday");
	}
	else if((a+b1)%7==6) {
		System.out.println("Wednesday");
	}
	}

}
