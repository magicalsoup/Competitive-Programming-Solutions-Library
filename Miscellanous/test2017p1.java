import java.util.Scanner;
public class test2017p1	{
public static void main(String[]args){
	@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int a=  scan.nextInt();
int b = scan.nextInt();
int sum = (a*(a-1))/2-b;
System.out.println(sum);
}
}
