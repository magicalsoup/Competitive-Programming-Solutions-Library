import java.util.*;
public class dwite08c3p2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while(cnt < 5){
			int count = 0;
			String s = sc.nextLine();
			String arr[] = s.split(" ");
			for(int i = 0; i < arr.length; i++){
				int len = 0;
				for(int j = 0; j < arr[i].length(); j++){
					if(arr[i].charAt(j) == '\'')
						len = 0;
					if(Character.isAlphabetic(arr[i].charAt(j)))
						len++;
				}
				if(len >= 4)
					count++;
			}
			System.out.println(count);
			cnt++;
		}
		sc.close();
	}
}
