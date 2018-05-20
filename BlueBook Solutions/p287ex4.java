import java.util.Scanner;
public class p287ex4{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
int t = scan.nextInt();
scan.nextLine();
boolean space = false;
for(int i=0;i<t;i++) {
String s = scan.nextLine();
String arr[] = s.split("(?!^)");
for(int j=0;j<arr.length;j++) {
if(arr[j].equals(" ")) {
	int y = j+1;
	System.out.println(y);
	space =true;
	break;
	//space =true;
}
else {
	space = false;
}
}
if(space == false) {		
	System.out.println("0");
}
}
}
}
