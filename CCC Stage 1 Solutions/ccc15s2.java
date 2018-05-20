import java.io.*;
public class ccc15s2{
public static void main(String[]args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int j = Integer.parseInt(in.readLine());
	int a = Integer.parseInt(in.readLine());
	String[] size = new String[j];
	for(int i=0;i<j;i++) {
		size[i] = in.readLine();
	}
	int count =0;
	for(int i=0;i<a;i++) {
		String s  = in.readLine();
		String[]cmd = s.split(" ");
		String asize = cmd[0];
		int number = Integer.parseInt(cmd[1]);
		if(asize.equals("S")) {
			if(!size[number-1].equals("T")) {
				size[number-1] = "T";
				count++;
			}
		}
		else if(asize.equals("M")) {
			if(size[number-1].equals("L")||size[number-1].equals("M")) {
				size[number-1] = "T";
				count++;
			}
		}
		else if(asize.equals("L")) {
			if(size[number-1].equals("L")) {
				size[number-1] = "T";
				count++;
			}
		}
	}
	System.out.println(count);
}
}
