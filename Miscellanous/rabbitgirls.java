import java.util.Scanner;
public class rabbitgirls{
	public static void main(String[] args) {
	@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int ans =0;
if(a%b==0||a==0||b==0){
	System.out.println(0);
	System.exit(0);
}
else if(a>b){
	 int fake = (a%b);
	 int fake2= 0;
	 //int s = a-i;
	 int i=0;
	 while(true) {
		 //System.out.println(i);
		 i++;
		 if((a+i)%b==0) {
			 fake2 = i;
			 break;
		 }
	 }
	 ans = Math.min(fake,fake2);
}
else {
	ans = b-a;
}
System.out.println(ans);
	}
}
