import java.util.Scanner;
public class coci072p1 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
int e = scan.nextInt();
int f = scan.nextInt();

if(a<=1) {
	System.out.print(1-a+" ");
}
else if(a>1) {
	System.out.print("-"+(a-1)+" ");
	}	

if(b<=1) {
	System.out.print(1-b+" ");
}
else if(b>1) {
	System.out.print("-"+(b-1)+" ");
	}	
if(c<=2) {
	System.out.print(2-c+" ");
}
else if(c>2) {
	System.out.print("-"+(c-2)+" ");
	}
if(d<=2) {
	System.out.print(2-d+" ");
}
else if(d>2) {
	System.out.print("-"+(d-2)+" ");
	}	
if(e<=2) {
	System.out.print(2-e+" ");
}
else if(e>2) {
	System.out.print("-"+(e-2)+" ");
	}	
if(f<=8) {
	System.out.print(8-f+" ");
}
else if(f>8) {
	System.out.print("-"+(f-8)+" ");
	}	

	
	
	
	
	
	}

}


