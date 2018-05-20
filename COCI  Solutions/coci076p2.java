import java.util.Scanner;
public class coci076p2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int s =sc.nextInt();
	int x =0,t=0;
	for(int i=0;i<n;++i) {
		int l,c,z;
		l = sc.nextInt();
		c = sc.nextInt();
		z = sc.nextInt();
		t+=l-x;
		x=l;
		while(t%(c+z)<c)++t;
	}
	t+=s-x;
	x = s;
	System.out.println(t);
}
}
