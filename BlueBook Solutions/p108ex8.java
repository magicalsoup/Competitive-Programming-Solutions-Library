
import java.util.Scanner;

public class p108ex8 {
	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[1000]; 
        String temp1;
        
        temp1 =  scan.nextLine();
        int t = Integer.parseInt(temp1);
        
for(int i =0; i< t; i++) {
	temp1 = scan.nextLine();
	arr[i] = Integer.parseInt(temp1);
	 //arr[i]=scan.nextInt(); 
    //System.out.println("i= "+ i + "value is " + arr[i] + "DEBUG");
}

int j;
for( j =0;j < t; j++) {
	if (arr[j] == 45) {
		System.out.println("N");
	}
	if ( arr[j] == 315) {
		System.out.println("N");
    }
	if(arr[j] == 135) {
		System.out.println("E");
}
if(arr[j] == 225) {
	System.out.println("S");
}

	if (((arr[j]) < 45)||((arr[j]) > 315)){
		System.out.println("N");
		
	}
if(((arr[j])< 135)&&((arr[j]) > 45)) {
	System.out.println("E");
}

if (((arr[j])<255)&&((arr[j]) > 135)) {
	System.out.println("S");
}
if(((arr[j]) < 315)&&((arr[j])> 255)){
	System.out.println("W");
}
}
	
	
	
	
	
	}	
	
}
