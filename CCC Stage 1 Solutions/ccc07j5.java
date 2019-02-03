import java.util.*;
public class ccc07j5{
	static List<Integer> pos = new ArrayList<Integer>(Arrays.asList(0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000));
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), m = sc.nextInt();
		for(int i = 0; i < m; i++) pos.add(sc.nextInt());
		long dp[] = new long[pos.size()]; dp[0] = 1;
		Collections.sort(pos);
		for(int i = 1; i < pos.size(); i++) {
			for(int j = 0; j < i; j++) {
				int dis = pos.get(i) - pos.get(j);
				if(dis >= a && dis <= b) dp[i] += dp[j];
			}
		}
		System.out.println(dp[pos.size() - 1]);
		sc.close();
	}
}

