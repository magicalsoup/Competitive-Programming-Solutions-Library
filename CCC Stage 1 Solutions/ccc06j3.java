import java.util.*;
public class ccc06j3{
	static String s;
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	while(true) {
		int count =0;
		int finalsum =0;
	 s=scan.nextLine();
	if(s.equals("halt")) {
		break;
	}
	System.out.println(sec(s)+pause(s));
	}
}
public static int sec(String s) {
	int sum =0;
	for(int i=0;i<s.length();i++) {
	char c = s.charAt(i);
	if(c=='a'||c=='d'||c=='g'||c=='j'||c=='m'||c=='p'||c=='t'||c=='w') {
		sum = sum+1;
	}
	else if(c=='b'||c=='e'||c=='h'||c=='k'||c=='n'||c=='q'||c=='u'||c=='x') {
		sum = sum+2;
	}
	else if(c=='c'||c=='f'||c=='i'||c=='l'||c=='o'||c=='r'||c=='v'||c=='y') {
		sum = sum+3;
		//System.out.println(sum);
	}
	else {
		sum = sum+4;
	}
	}

return sum;
}
public static int pause(String s) {
	int sum =0;
	for(int i=0;i<s.length()-1;i++) {
		char c = s.charAt(i);
		char d = s.charAt(i+1);
		if((c=='a'||c=='b'||c=='c')&&(d=='a'||d=='b'||d=='c')) {
		sum = sum+2 ;
		}
		else if((c=='d'||c=='e'||c=='f')&&(d=='d'||d=='e'||d=='f')) {
			sum+=2;
		}
		else if((c=='g'||c=='h'||c=='i')&&(d=='g'||d=='h'||d=='i')) {
			sum+=2;
		}
		else if(c=='j'||c=='k'||c=='l'&&(d=='j'||d=='k'||d=='l')) {
			sum+=2;
		}
		else if((c=='m'||c=='n'||c=='o')&&(d=='m'||d=='n'||d=='o')) {
			sum+=2;
		}
		else if((c=='p'||c=='q'||c=='r'||c=='s')&&(d=='p'||d=='q'||d=='r'||d=='s')) {
			sum+=2;
		}
		else if((c=='t'||c=='u'||c=='v')&&(d=='t'||d=='u'||d=='v')) {
			sum+=2;
		}
		else if((c=='w'||c=='x'||c=='y'||c=='z')&&(d=='w'||d=='x'||d=='y'||d=='z')) {
			sum+=2;
		}
	}
	return sum;
}
}
