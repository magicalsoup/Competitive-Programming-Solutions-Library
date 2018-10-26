import java.util.*;
public class Java {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int index = 0;
		boolean found = false;
		for(int i = 0; i < str.length() - 3; i++) {
			if(str.substring(i, i + 4).equals("java")) {
				found = true;
				break;
			}
			index++;
		}
		if(!found)
			index+=3;
		System.out.println(index);
		sc.close();
	}
}
