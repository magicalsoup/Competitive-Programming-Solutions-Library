	import java.util.*;
	public  class dwiteoct07p3{
		public static void main(String[] args) {
			@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		 String DVORAK = "[]',.pyfgcrl/=aoeuidhtns-;qjkxbmwvz{}\"<>PYFGCRL?+AOEUIDHTNS_:QJKXBMWVZ";
		  String QWERTY = "-=qwertyuiop[]asdfghjkl;'zxcvbnm,./_+QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
		
		
			String str = scan.nextLine();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				int index = DVORAK.indexOf(c);
				if (index != -1)
					System.out.print(QWERTY.charAt(index) + "");
				else
					System.out.print(c + "");
			}
			System.out.println();
		}	
	}
