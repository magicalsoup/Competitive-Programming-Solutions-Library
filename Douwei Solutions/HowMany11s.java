package Douwei
import java.util.*;
public class HowMany11s {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int str = 0;
		int elevens = 0;
		for(int i = 0; i < k; i++){
			int cur = n&1;
			if(cur==1)
				str++;
			else{
				if(str==2)
					elevens++;
				str = 0;
			}
			n/=2;
		}
		System.out.println(elevens);
		sc.close();
	}
}
