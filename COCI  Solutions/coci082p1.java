import java.util.Scanner;
public class coci082p1{
public static void main(String[]args){
	@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int d = scan.nextInt();
int t = a*c;
int f = b*d;
if(a*b==c*d){
System.out.println(a*b);
}
    else if(t>=f){
    System.out.println(f);
    }
   else if(f>=t){
    System.out.println(t);
    }
}
}
