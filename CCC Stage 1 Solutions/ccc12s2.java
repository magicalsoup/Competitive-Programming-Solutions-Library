import java.io.*;
import java.util.*;
public class ccc12s2{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int pretotal = 0;
		int prero = 999999;
		int total =0;
		for(int i=0;i<input.length();i+=2) {
			int ar = (int)(input.charAt(i)-48);
			String r = input.substring(i+1, i+2);
			int temptotal;
			int ro =0;
			if(r.equals("I")) ro = 1;
			else if(r.equals("V")) ro = 5;
			else if(r.equals("X")) ro = 10;
			else if(r.equals("L")) ro = 50;
			else if(r.equals("C")) ro = 100;
			else if(r.equals("D")) ro = 500;
			else if(r.equals("M")) ro = 1000;
			temptotal =ro*ar;
			if(ro>prero) total = total - 2*pretotal;
			total = total +temptotal;
			prero = ro;
			pretotal = temptotal;
		}
		System.out.println(total);
	}

}
