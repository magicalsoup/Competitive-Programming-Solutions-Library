import java.util.*;
import java.io.*;
public class ccc15s3 {
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int g =Integer.parseInt(br.readLine());
	int p = Integer.parseInt(br.readLine());
	int[] planes = new int[g+1];
	int count= 0;
	int i=0;
	boolean keep  = true;
	while(i<p&&keep) {
		int cplane = Integer.parseInt(br.readLine());
		while(cplane>0&&planes[cplane]>0) {
			int t= planes[cplane];
			planes[cplane] = planes[cplane]+1;
			cplane = cplane-t;
		}
		if(cplane<=0) {
			keep = false;
		}
		else {
			planes[cplane] = 1;
			count++;
		}
		i++;
	}
	System.out.println(count);
}
}
