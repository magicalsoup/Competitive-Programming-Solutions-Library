
import java.util.Scanner;
public class coci062p2{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int myarray[] = new int[3];
		
		for(int i = 0; i < 3; i++) {
			myarray[i] = scan.nextInt();
		}
		@SuppressWarnings("unused")
		String t = scan.nextLine();
		String d = scan.nextLine();
		
		int temp = 0;
		for(int i = 0; i < 3; i ++){
			for(int j = 1; j < 3 - i; j++){
				if(myarray[j-1] > myarray[j]){
				temp = myarray[j-1];
				myarray[j-1] = myarray[j];
				myarray[j] = temp;
				}
			}
		}
		if(d.equals("ABC")) {
		System.out.println(myarray[0] + " " + myarray[1] + " " + myarray[2]);
		}
		else if(d.equals("ACB")) {
			System.out.println(myarray[0] + " " + myarray[2] + " " + myarray[1]);
			}
		else if(d.equals("BCA")) {
			System.out.println(myarray[1] + " " + myarray[2] + " " + myarray[0]);
			}
		else if(d.equals("BAC")) {
			System.out.println(myarray[1] + " " + myarray[0] + " " + myarray[2]);
			}
		else if(d.equals("CBA")) {
			System.out.println(myarray[2] + " " + myarray[1] + " " + myarray[0]);
			}
		else if(d.equals("CAB")) {
			System.out.println(myarray[2] + " " + myarray[0] + " " + myarray[1]);
			}
	}
}
