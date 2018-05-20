import java.util.Scanner;

public class a1{ 
public static void main (String[] args) {
    @SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int m = scan.nextInt();


for(int i=0;i<m;i++) {

	int position = scan.nextInt();
	
	
	String s1 = scan.nextLine();
	
    /*StringBuilder s2 = new StringBuilder(s1);
    
    s2.deleteCharAt(position-1);*/
	String res = s1.substring(0, position)+ s1.substring(position+1);
	System.out.println(i+1 + " " + res);
	}
	}
}
