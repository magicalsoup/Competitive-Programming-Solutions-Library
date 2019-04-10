import java.util.*;
import java.util.Map.Entry;


public class WelcomeBackToTheWorldOfMath {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> mode = new HashMap<Integer, Integer>();
		
		ArrayList<Integer> med = new ArrayList<Integer>();
		ArrayList<Double> mean = new ArrayList<Double>();
		for(int i = 0; i < n; i++) {
			
			HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();  
			int b[] = new int[n];
			double ave = 0;
			for(int j = 0; j < n; j++) {
				int x = sc.nextInt();
				if(!mp.containsKey(x))
					mp.put(x, 1);
				else
					mp.put(x, mp.get(x) + 1);
				b[j] = x;
				ave += x;
			}
			ave = ave / (double)(n);
			Arrays.sort(b);
			
			med.add(b[n / 2]);
			mean.add(ave);
			int max = 0;
			int num = 0;
			int prev = 0;
			for(Entry<Integer, Integer> src : mp.entrySet() ) {
				if(src.getValue() > max || (src.getValue() == max && src.getKey() > prev)) {
					max = src.getValue();
					num = src.getKey();
					prev = src.getKey();
				}
			}
			if(!mode.containsKey(num))
				mode.put(num, 1);
			else
				mode.put(num, mp.get(num) + 1);
		}
		
		int max = 0;
		int num = 0;
		int prev = 0;
		for(Entry<Integer, Integer> src : mode.entrySet()) {
			if(src.getValue() > max || (src.getValue() == max && src.getKey() > prev)) {
				max = src.getValue();
				num = src.getKey();
				prev = src.getKey();
			}
		}
		Collections.sort(med);
		
		double ave = 0;
	
		for(Double i : mean) ave += i;
		
		System.out.print(med.get(n / 2) + " ");
		System.out.print(num + " ");
		System.out.printf("%.2f", ave / (double)(n));
		
		sc.close();
	}
}
