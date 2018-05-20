import java.io.*;
public class dp1p4 {
public static void main(String[]args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String temp = br.readLine();
int[]dp = new int[temp.length()+1];
int[]letters = new int[26];
for(int i=1;i<=temp.length();i++)
{
	dp[i] = dp[i-1]*2;
	if(letters[temp.charAt(i-1)-97]==0)
	{
		dp[i]++;
		letters[temp.charAt(i-1)-97]= i;
	}
	else
	{
		dp[i]-=dp[letters[temp.charAt(i-1)-97]-1];
		letters[temp.charAt(i-1)-97] = i;
	}
	dp[i] %=10007;
}
System.out.println(dp[temp.length()]%10007);
}
}
