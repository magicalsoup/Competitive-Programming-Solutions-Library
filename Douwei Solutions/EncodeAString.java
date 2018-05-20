package Douwei;
import java.util.*;
	public class EncodeAString {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str=  sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='0')
				System.out.print('a');
			else if(c=='1')
				System.out.print('b');
			else if(c=='2')
				System.out.print('c');
			else if(c=='3')
				System.out.print('d');
			else if(c=='4')
				System.out.print('e');
			else if(c=='5')
				System.out.print('f');
			else if(c=='6')
				System.out.print('g');
			else if(c=='7')
				System.out.print('h');
			else if(c=='8')
				System.out.print('i');
			else if(c=='9')
				System.out.print('j');
			
			else if(c=='a')
				System.out.print('0');
			else if(c=='b')
				System.out.print('1');
			else if(c=='c')
				System.out.print('2');
			else if(c=='d')
				System.out.print('3');
			else if(c=='e')
				System.out.print('4');
			else if(c=='f')
				System.out.print('5');
			else if(c=='g')
				System.out.print('6');
			else if(c=='h')
				System.out.print('7');
			else if(c=='i')
				System.out.print('8');
			else if(c=='j')
				System.out.print('9');
			
			else if(c=='k')
				System.out.print('l');
			else if(c=='m')
				System.out.print('n');
			else if(c=='p')
				System.out.print('q');
			else if(c=='t')
				System.out.print('u');
			else if(c=='y')
				System.out.print('z');
			
			else if(c=='l')
				System.out.print('k');
			else if(c=='n')
				System.out.print('m');
			else if(c=='q')
				System.out.print('p');
			else if(c=='u')
				System.out.print('t');
			else if(c=='z')
				System.out.print('y');
			else
				System.out.print(c);
	
		}
	}
	}