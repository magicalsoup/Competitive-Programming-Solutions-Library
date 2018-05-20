import java.util.*;
public class dwitesep09p2 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String s, space;
	int num,blank,prime= 0;
	char [] nums = {'0','1','2','3','4','5','6','7','8','9',};
	for(int x=0;x<5;x++) {
		s = sc.next();
		prime =0;
		for(int i=0;i<10;i++) {
			space = s.replace('_', nums[i]);
			num = Integer.parseInt(space);
			blank = Integer.parseInt(Character.toString(nums[i]));
			if(prime(num)) {
				System.out.print(blank+" ");
			prime++;
			}
		}
			if(prime==0) 
				System.out.println("Not possible");
			else if(prime>0)
				System.out.println();
	}
}
public static boolean prime(int n)
{
	if (n == 1||n==0)
		return false;
	
	for (int i = 2;i<=Math.sqrt((double)n);i++)
	{
		if (n%i==0)
		{
			return false;
		}
	}
	
	return true;
}
}
