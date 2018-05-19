import java.util.*;
public class smac081p1{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int  []alpha = new int [26];
	char[]s1 = sc.next().toCharArray();
	char[]s2 = sc.next().toCharArray();
	for(int x=0;x<s1.length;x++)
	alpha[s1[x]-'a']++;
for(int x=0;x<s2.length;x++)
	alpha[s2[x]-'a']++;
for(int x=0;x<26;x++)
if(alpha[x]%2!=0){
System.out.println("No");
return;
}
System.out.println("Yes");
}
}
