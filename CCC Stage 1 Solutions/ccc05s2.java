import java.util.*;
public class ccc05s2{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int ixo = scan.nextInt();
		int iyo = scan.nextInt();
		int xo = 0;
		int yo =0;
		int ia,ib;
		ia= scan.nextInt();
		ib = scan.nextInt();
		while(ia!=0||ib!=0) {
			if(ia+xo<0) {
				xo =0;
			}
			else if(ia+xo<=ixo) {
				xo = xo+ia;
			}
			else if(ia+xo>ixo) {
				xo = ixo;
			}
			if(ib+yo<0) {
				yo =0;
			}
			else if(ib+yo<=iyo) {
				yo = yo+ib;
			}
			else if(ib+yo>iyo) {
				yo = iyo;
			}
			System.out.println(xo+" "+yo);
			ia = scan.nextInt();
			ib = scan.nextInt();
		}
	}
}
