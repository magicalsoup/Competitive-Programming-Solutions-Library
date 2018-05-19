import java.util.Scanner;

public class wc154j1 {
public static void main (String[] args) {
	    @SuppressWarnings("resource")
    	Scanner scan = new Scanner(System.in);
    	int t =scan.nextInt();
    	int b = scan.nextInt();
    	int counter = 0;
    for(int i=0;i<t;i++) {
	 int time = scan.nextInt();
	
if(time%b==0) {
	counter++;
}
    }
	System.out.println(counter);
}
}
