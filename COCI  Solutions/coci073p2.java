import java.util.*;
public class coci073p2{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	String number = scan.nextLine();
	while(number.length()%3!=0) {
		number = "0"+number;
	}
	for(int i=0;i<number.length();i+=3) {
		System.out.print(Integer.toString(Integer.parseInt(number.substring(i,i+3),2),8));
	}
	
}
}
