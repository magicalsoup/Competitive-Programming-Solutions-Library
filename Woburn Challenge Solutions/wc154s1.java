    import java.util.*;
public class wc154s1{
	@SuppressWarnings({ "unchecked", "resource", "rawtypes" })
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int []d = new int[m];
		int [] h = new int[n];
		int [] ans = new int[m];
		TreeMap<Integer,Integer> tm = new TreeMap();
		for(int i=0;i<n;++i) 
			h[i] =scan.nextInt();
		Arrays.sort(h);
		for(int i=0;i<n;++i) 
			tm.put(h[i], i);
		for(int i=0;i<m;++i)
			d[i] = scan.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i= m-1;i>0;--i) {
			min = Math.min(min,d[i]);
			Integer key = tm.floorKey(min);
			if(key==null) ans[i-1] =0;
			else ans[i-1] =tm.get(key)+1;
		}
			ans[m-1] =n;
			for(int i:ans)
				System.out.println(i);	
	}
}
