import java.util.Scanner;
public class q4 {
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
for(int i = 0; i < a; i++){
scan.nextLine();
String b = scan.nextLine();
String c = scan.nextLine();
String d = scan.nextLine();
String e = scan.nextLine();
if(b.equals("XXXX") || c.equals("XXXX") || d.equals("XXXX")||e.equals("XXXX") ){
System.out.println("Yes");
}
else if(b.charAt(0)=='X'&&c.charAt(0)=='X'&&d.charAt(0)=='X'&&e.charAt(0)=='X') {
System.out.println("Yes");
}
else if(b.charAt(1)=='X'&&c.charAt(1)=='X'&&d.charAt(1)=='X'&&e.charAt(1)=='X') {
System.out.println("Yes");
}
else if(b.charAt(2)=='X'&&c.charAt(2)=='X'&&d.charAt(2)=='X'&&e.charAt(2)=='X') {
System.out.println("Yes");
}
else if(b.charAt(3)=='X'&&c.charAt(3)=='X'&&d.charAt(3)=='X'&&e.charAt(3)=='X') {
System.out.println("Yes");
}
else if(b.charAt(0)=='X'&&c.charAt(1)=='X'&&d.charAt(2)=='X'&&e.charAt(3)=='X') {
System.out.println("Yes");
}
else if(b.charAt(3)=='X'&&c.charAt(2)=='X'&&d.charAt(1)=='X'&&e.charAt(0)=='X') {
System.out.println("Yes");
}
else {
System.out.println("No");
}
}
}
}
