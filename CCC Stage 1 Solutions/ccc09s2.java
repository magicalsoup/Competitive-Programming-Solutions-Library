import java.util.*;
public class ccc09s2{
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	String [] rows;
	String [] above = new String[256];
	int abovesize;
	String[] below = new String[256];
	int belowsize;
	int r,l,k;
	String newrow;
	r = scan.nextInt();
	l = scan.nextInt();
	rows = new String[r];
	for(int i=0;i<r;i++)
	{
		rows[i] = "";
		for(int j=0;j<l;j++) {
			rows[i] = rows[i]+ scan.next();
		}
	}
	above[0] = rows[0];
	abovesize = 1;
	belowsize = 1;
	for(int i=1;i<r;i++) {
		below[0]= rows[i];
		belowsize = 1;
		for(int j=0;j<abovesize;j++) {
			newrow = pushButton(above[j],below[0]);
			k =0;
			while(k<belowsize&&!below[k].equals(newrow))
				k++;
			if(k>=belowsize) {
				below[belowsize] = newrow;
				belowsize++;
			}
		}
		for(int j=0;j<belowsize;j++)
			above[j] =below[j];
		abovesize = belowsize;
	}
	System.out.println(belowsize);
}
public static String pushButton(String s,String t) {
	String x;
	x ="";
	for(int i=0;i<s.length();i++)
		if(s.charAt(i)==t.charAt(i))
			x= x+"0";
		else
			x= x+'1';
	return x;
}
}
