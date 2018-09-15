import java.util.*;
public class PhoneBook {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String name[] = new String[n];
		String phone[] = new String[n];
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			name[i] = sc.next();
			phone[i] = sc.next();
		}
		int d = sc.nextInt();
		for(int i = 0; i < d; i++) {
			String s = sc.next();
			mp.put(s, mp.getOrDefault(s, 0)+1);
		}
		int max = 0;
		String freqName = "";
		String freqPhone = "";
		for(int i = 0; i < n; i++) {
			int t = mp.getOrDefault(phone[i], 0);
			if(t > max || t == max && phone[i].compareTo(freqPhone) < 0) {
				max = mp.get(phone[i]);
				freqName = name[i];
				freqPhone = phone[i];
			}
		}
		System.out.println(freqName);
		sc.close();
	}
}
