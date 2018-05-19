import java.util.*;
public class wc173s1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int qq = Integer.MAX_VALUE;
	for(int casenum = 1;casenum<=qq;casenum++) {
		int n = sc.nextInt();
		int[][]g = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j= 0;j<n;j++) {
				g[i][j] = sc.nextInt();
			}
		}
		ArrayList<Integer>l = new ArrayList<Integer>();
		ArrayList<Integer>r = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			for(int j= i+1;j<n;j++) {
				l.add(i);
				r.add(j);
			}
		}
		for(int mask =0;mask<1<<l.size();mask++) {
			Set<Integer>[]edges = new Set[n];
			for(int i=0;i<n;i++) {
				edges[i] = new HashSet<Integer>();
			}
			for(int i=0;i<l.size();i++) {
				if((mask&(1<<i))==0) continue;
				edges[l.get(i)].add(r.get(i));
				edges[r.get(i)].add(l.get(i));
			}
			boolean good = true;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==j) {
						if(g[i][j]!=0)good = false;
						continue;
					}
					int s= 0;
					for(int k=0;k<n;k++) {
						if(edges[i].contains(k)&&edges[j].contains(k)) {
							s++;
						}
					}
					if(s!=g[i][j])good = false;
				}
			}
			if(!good)continue;
			System.out.println(Integer.bitCount(mask));
			for(int i=0;i<l.size();i++) {
				if((mask&(1<<i))==0)continue;
				System.out.println((l.get(i)+1)+" "+(r.get(i)+1));
			}
			System.exit(0);
		}
		System.out.println("Impossible");
	}
	
}
}
