import java.util.*;
public class ecoo17r1p4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 10; t++) {
			int n = sc.nextInt(); String a[] = new String[n];
			int min = 0x3f3f3f3f;
			for(int i = 0; i < n; i++) a[i] = sc.next();
			for(int i = 0; i < n; i++) {
				min = Math.min(min, findNumSwaps(copyOver(i, a)));
			}
			System.out.println(min);
		}
		sc.close();
	}
	static int findNumSwaps(String a[]) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		Map<String, Integer> hm = new HashMap<String, Integer>();
		int swaps = 0;
		for(int i = 0; i < a.length; i++) {
			pq.offer(a[i]);
            hm.put(a[i], i);
        } 
		for(int i = 0; i < a.length; i++) {
			String s = pq.poll();
			if(!a[i].equals(s)){
				swaps++;
				int k = hm.get(s);
				a[k] = a[i];
				hm.put(a[k], k);
			}
		}
		return swaps;
	}
	static boolean isSorted(String s[]) {
		for(int i = 0; i < s.length - 1; i++) {
			if(s[i].compareTo(s[i + 1]) < 0) continue;
			else return false;
		}
		return true;
	}
	static String[] copyOver(int idx, String[] a){
		ArrayList<String> res = new ArrayList<String>();
		for(int i = 0; i < a.length; i++) 
			if(i != idx) res.add(a[i]);
		String ans[] = new String[res.size()];
		int i = 0;
		for(String s : res) {
			ans[i] = s;
			i++;
		}
		return ans;
	}
}
