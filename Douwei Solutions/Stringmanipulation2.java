package Douwei;
	import java.util.*;
	public class Stringmanipulation2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(); 
		String b= sc.next();
		System.out.println(count(a,b));	
		}
	public static int count(final String string, final String substring)
	{
	   int count = 0;
	   int idx = 0;
	   while ((idx = string.indexOf(substring, idx)) != -1)
	   {
	      idx++;
	      count++;
	   }
	   return count;
	}
	public static int count(final String string, final char c)
	{
	   return count(string, String.valueOf(c));
	}
	}