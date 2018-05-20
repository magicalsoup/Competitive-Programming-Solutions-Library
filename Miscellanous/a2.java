import java.util.Scanner;

public class a2 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
 //String n = scan.nextLine();
 //int i = 0; 
 String[] arr= new String [100000];
 
 int totalnumber = 0;
 
for (int i = 0; i< 100000; i++) {
	arr[i] = scan.nextLine();
	if ((arr[i]).equals("  ")){
		System.out.println("Ready");
		totalnumber = i;
		break;
	}
}
              
for ( int j = 0 ; j < totalnumber; j++) {
	//String n = scan.nextLine();
	if  ((arr[j]).equals("  "))
	 {break;}
	else if ((arr[j]).equals("qp") ||(arr[j]).equals( "pq")||(arr[j]).equals("db")|| (arr[j]).equals("bd") ){
		  System.out.println("Mirrored pair");
		  
	 } else  {
	       System.out.println("Ordinary pair");
	 }
	}
	}
}
