import java.util.*;
public class wc162s1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	String s1 = "false";
	String s2 = "true";
	for(int i=0;i<n;i+=2) {
		String s3 = "",s = "";
		s = sc.next();
		if(s.equals("false"))
			s2 = "false";
		if(s.equals("unknown")&&s2.equals("true"))
			s2 = "unknown";
		if(i<(n-1))
			s3 = sc.next();
		if(!"and".equals(s3)) {
			if(s2.equals("true"))
				s1 = "true";
		
		if(s2.equals("unknown")&&s1.equals("false"))
			s1 = "unknown";
		s2 = "true";
	}
	}
	System.out.println(s1);
}
}
