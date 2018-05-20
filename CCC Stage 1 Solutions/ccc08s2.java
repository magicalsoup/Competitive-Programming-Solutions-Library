import java.util.Scanner;
public class ccc08s2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true) {
			int a = scan.nextInt();
			if( a==0) {
				break;
			}
			int count=1;
			for(int x=-a;x<0;x++) {
				for(int y=-a;y<0;y++) {
					
					if(x*x+y*y<=a*a) {
						count++;
					}
				}
			}
			//System.out.println("DEBUG now count is " + count);
			count = 4*count  + 4 * a -3;
			System.out.println(count);
						
		}
	}
}