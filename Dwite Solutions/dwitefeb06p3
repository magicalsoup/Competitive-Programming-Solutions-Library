import java.util.*;
import java.io.*;
public class dwitefeb06p3{
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<5;i++) {
				String s = br.readLine();
				String arr[] = s.split("(?!^)");
				int arrz[] = new int[12];
				for(int j =0;j<12;j++) {
					arrz[j] = Integer.parseInt(arr[j]);
				}
				int sum =0;
				for(int j=0;j<12;j++) {
					if(j%2==0) {
						sum = sum+(3*arrz[j]);
					}
					else {
						sum +=arrz[j];
					}
				}
				if(sum%10==0) {
					System.out.println(s);
				}
				else {
					String str = s.substring(0, 11);
					int y = sum%10;
					int z = Integer.parseInt(arr[11])-y;
					if(z<0) {
						z = 10+z;
					}
					String s1 = Integer.toString(z);
					System.out.println(str+s1);
				}
					
		}
	}
}
