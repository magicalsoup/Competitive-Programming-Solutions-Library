import java.util.*;
public class CatsAndAMouse {
    static String catAndMouse(int x, int y, int z) {
    	if(Math.abs(x-z)==Math.abs(y-z))
    			return "Mouse C";
    	else if(Math.abs(x-z)<Math.abs(y-z))
    			return "Cat A";
    	
    	return "Cat B";

    }
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		while(q-->0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			System.out.println(catAndMouse(x,y,z));
		}
		sc.close();
	}
}
