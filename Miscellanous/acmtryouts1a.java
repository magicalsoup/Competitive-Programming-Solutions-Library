import java.util.Scanner;
public class acmtryouts1a {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 String[] arr= new String [100000];
		 int m = scan.nextInt();
		 
	for (int i = 0 ; i <= m ; i++){
		arr[i] = scan.nextLine();
		//System.out.println("This is number "+i+" and value is "+arr[i]);
	}
	
	for ( int j = 1 ; j <= m; j++) {
	 if ((arr[j]).equals("Scissors")) {
			System.out.println("Rock");		
		}
	 if ((arr[j]).equals("Fox") ) {
			System.out.println("Foxen");
		}
	 if ((arr[j]).equals("Rock")) {
			System.out.println("Paper");
		}
    if  ((arr[j].equals("Foxen"))) {
			break;}
		
	 if ((arr[j]).equals("Paper")) {
			System.out.println("Scissors"); 
		}
	}	
	}
 }
