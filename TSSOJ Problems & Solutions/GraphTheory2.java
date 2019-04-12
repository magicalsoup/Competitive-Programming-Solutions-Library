import java.util.*;
public class GraphTheory2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(), k = sc.nextLong();
		System.out.println(n <= k? "Scam!" : "Graph Theory!");
		sc.close();
	}
}
