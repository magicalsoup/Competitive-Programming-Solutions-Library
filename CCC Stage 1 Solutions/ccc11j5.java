import java.io.*;
import java.util.*;
public class ccc11j5{
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int people = Integer.parseInt(br.readLine());
	int[] invited= new int[] {1,1,1,1,1,1,1};
	for(int i=0;i<people-1;i++) {
		int invitedby = Integer.parseInt(br.readLine());
		 invited[invitedby] = invited[invitedby]*(1+invited[i+1]);
	}
	System.out.println(invited[people]);
}
}
