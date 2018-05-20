import java.util.Scanner;

public class coci092p1{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	      Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b =scan.nextInt();
if(a==1||b==1) {
	System.out.println(b);
	System.exit(0);
}
if(a==0||b==0) {
	System.out.println("0");
}

for(int y=1;y<100000;y++) {
if(a<b) {
	double s = y/a;
	double t = Math.ceil(s/1.0);
	if(t == b) {


int z = (int)t;
System.out.println(z);
System.exit(0);
}
}
double d = Math.ceil((y/a)/1.0);

	if ((y/a==d&&y/a>=b-1&&a<=b)||(y/a==d&&y/a>=b-1&&a>=b)) {
	System.out.println(y+1);
System.exit(0);
	}
}
	}
}


	
	
	
	

	
	
