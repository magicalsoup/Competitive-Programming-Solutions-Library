import java.util.*;
public class FortniteDubs {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double w = 0;
		for(int i = 0; i < n; i++) {
			if(sc.next().equals("DUB")) w++;
		}
		
		double rate = Math.floor(w / n * 10);
		if(rate == 7)
			System.out.println("Tfue");
		else if(rate == 5)
			System.out.println("Ninja");
		else if(rate == 4)
			System.out.println("Myth");
		else if(rate < 4)
			System.out.println("default skin");
		else 
			System.out.println("Uh Oh It's Thanos");
		
		sc.close();
	}
}
