import java .util.Scanner;
public class p184ex8 {
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		String arr[] = new String[t];
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int e=0;
		int f=0;
		int g=0;
for(int i=0;i<t;i++) {
	arr[i]= scan.nextLine();
}
for(int i=0;i<t;i++) {
	if(arr[i].equals("A")) {
		a++;
	}
	else if(arr[i].equals("B")) {
		b++;
	}
	else if(arr[i].equals("C")) {
		c++;
	}
	else if(arr[i].equals("D")) {
		d++;
	}
	else if(arr[i].equals("E")) {
		e++;
	}
	else if(arr[i].equals("F")) {
		f++;
	}
	else {
		g++;
	
	}
}
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
	}
}
