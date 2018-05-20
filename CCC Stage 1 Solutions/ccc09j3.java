import java.util.Scanner;
public class ccc09j3{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int v = n-300;
		int e = n-200;
		int w = n-100;
		int t = n;
		int h = n+100;
		int stj = n+130;
		String n1 ="";
		String v1 = "";
		String e1 = "";
		String w1 = "";
		String t1 = "";
		String h1 ="";
		String stj1 = "";
		if(v<0) {
			v = v+2400;
		}
		if (e<0) {
			e = e+2400;
		}
		if(w<0) {
			w = w+2400;
		}
		if(h<0) {
			h = h+2400;
		}
		if(stj<0) {
			stj = stj+2400;
		}
		if(v>2400) {
			v = v-2400;
		}
		if(e>2400) {
			e = e-2400;
		}
		if(w>2400) {
			w =w-2400;
		}
		if(h>2400) {
			h = h-2400;
		}
		if(stj>2400) {
			stj = stj-2400;
		}
		if(stj/10%10>5) {
			stj = stj-60+100;
		}
		//System.out.println(stj/10%10);
		System.out.println(n+" in Ottawa");
		System.out.println(v+" in Victoria");
		System.out.println(e+" in Edmonton");
		System.out.println(w+" in Winnipeg");
		System.out.println(n+" in Toronto");
		System.out.println(h+" in Halifax");
		System.out.println(stj+" in St.John's");
	}	
}