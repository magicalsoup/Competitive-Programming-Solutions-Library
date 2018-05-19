import java.util.*;
public class wc173j2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	double total =0;
	double ans = 0;
	double pos =0;
	double neg =0;
	for(int i=0;i<a;i++) {
		char vote = sc.next().charAt(0);
		if(vote=='N')
			neg++;
		else
			pos++;
		
		total = pos/(pos+neg);
		if(total>=ans)
			ans = total;
	}
	System.out.println(ans);
}
}
