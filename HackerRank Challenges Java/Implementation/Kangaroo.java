import java.util.*;
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	if(v2>=v1)
    		return "NO";
    	else if((x2-x1)%(v1-v2)==0)
    		return "YES";
    	return "NO";
    }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(kangaroo(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		sc.close();
	}
}
