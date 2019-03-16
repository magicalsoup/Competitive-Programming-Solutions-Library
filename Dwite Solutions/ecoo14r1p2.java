import java.util.*;
public class ecoo14r1p2 {
	static Map<String, String> mp = new HashMap<String, String>();
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		init();
		for(int t = 0; t < 10; t++) {
			@SuppressWarnings("unused")
			String s1 = sc.next(), s2 = sc.next();

			for(int i = 0; i < 7; i++) {
				
				String curS = s1.substring(i);
				String a = convert1(curS);
				String b = convert2(curS);
				
				String bits1[] = new String[a.length() / 8];
				String bits2[] = new String[b.length() / 8];
				splitIntoBytes(a, bits1); splitIntoBytes(b, bits2);
				
				if(valid(bits1)) {
					for(String cur : bits1)
						System.out.print(mp.get(cur));
					System.out.println();	
				}
				if(valid(bits2)) {
					for(String cur : bits2)
						System.out.print(mp.get(cur));
					System.out.println();
				}
				
			}
		}
		
		sc.close();
	}
	static boolean valid(String bits[]) {
		for(String s : bits)
			if(!mp.containsKey(s) || s.length() != 8)
				return false;
		return true;
	}
	static void splitIntoBytes(String s, String bits[]) {
		for(int i = 0; i < bits.length; i++) {
			bits[i] = s.substring(i * 8, (i + 1) * 8);
		}	
	}
	static void init() {
		mp.put("00100000", " ");
		mp.put("01000001", "A");
		mp.put("01000010", "B");
		mp.put("01000011", "C");
		mp.put("01000100", "D");
		mp.put("01000101", "E");
		mp.put("01000110", "F");
		mp.put("01000111", "G");
		mp.put("01001000", "H");
		mp.put("01001001", "I");
		mp.put("01001010", "J");
		mp.put("01001011", "K");
		mp.put("01001100", "L");
		mp.put("01001101", "M");
		mp.put("01001110", "N");
		mp.put("01001111", "O");
		mp.put("01010000", "P");
		mp.put("01010001", "Q");
		mp.put("01010010", "R");
		mp.put("01010011", "S");
		mp.put("01010100", "T");
		mp.put("01010101", "U");
		mp.put("01010110", "V");
		mp.put("01010111", "W");
		mp.put("01011000", "X");
		mp.put("01011001", "Y");
		mp.put("01011010", "Z");
	}
	static String convert1(String s) {
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i + 1).equals("A") || s.substring(i, i + 1).equals("T"))
				res += "1";
			else res += "0";
		}
			
		return res;
	}
	static String convert2(String s) {
		String res = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i, i + 1).equals("A") || s.substring(i, i + 1).equals("T"))
				res += "0";
			else res += "1";
		}
			
		return res;
	}
}
