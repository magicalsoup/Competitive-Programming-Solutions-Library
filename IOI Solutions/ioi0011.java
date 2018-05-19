import java.util.*;
public class ioi0011 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	sc.nextInt();
	String a = sc.next();
	String b = reverse(a);
	final int len = a.length();
	int a1[] = new int[len+1];
	int a2[] = new int [len+1];
	for(int i=0;i<len;i++)
	{
		for(int j=0;j<len;j++) 
		{
		if(a.charAt(i)==b.charAt(j))
			a2[j+1] = 1+a1[j];
		else
			a2[j+1] = Math.max(a2[j], a1[j+1]);
		}
		int[] swap = a1;
		a1 = a2;
		a2 = swap;
	}
	System.out.println(len-a1[len]);
}
public static String reverse(String s) {
	String res ="";
	for(int i=s.length()-1;i>=0;i--)
	{
		res+=s.charAt(i);
	}
	return res;
}
}
