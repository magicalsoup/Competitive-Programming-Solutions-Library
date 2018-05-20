import java.util.Scanner;
public class ccc17j2{
	public static void main (String[] args) {
	    
    	Scanner scan = new Scanner(System.in);

int n =scan.nextInt();
int k =scan.nextInt();
int n1 =n;
	int s=0;
for(int i=1;i<=k;i++) {
	n =n*10;
	s =s+n ;	
}

System.out.println(s+n1);

	
	
	
	}
	}
