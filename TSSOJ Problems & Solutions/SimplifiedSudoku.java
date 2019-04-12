import java.util.*;
public class SimplifiedSudoku {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {0,1,1,1,1,1,1,1,1,1};
		for(int i = 0; i < 8; i++)
			a[sc.nextInt()]--;
		
		for(int i = 1; i <= 9; i++)
			if(a[i] == 1)
				System.out.println(i);
		sc.close();
	}
}
