import java.io.*;
public class ioi1113{
	static long L;
	static long X[];
	static long precl[];
	static long precr[];
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l[] =br.readLine().split(" ");
		int R = Integer.parseInt(l[0]);
		L = Long.parseLong(l[1]);
		long B = Long.parseLong(l[2]);
		X = new long[R];
		for(int i=0;i<R;i++) {
			X[i] = Integer.parseInt(br.readLine());
		}
		int maxt =0;
		precr = new long[R];
		precl = new long[R];
		precr[0] =0;
		precl[R-1] =0;
		for(int i=1;i<R;i++) {
			precr[i] =precr[i-1]+X[i];
		}
		for(int i=R-2;i>=0;i--) {
			precl[i] =precl[i+1]+L-X[i];
		}
		for(int i=0;i<R;i++) {
			int min =i;
			int max = R-1;
			while(min<max) {
				int ind= (min+max+1)/2;
				long size = getDist(i,ind);
				if(size>B)max = ind-1;
				else min = ind;	
			}
			maxt = Math.max(maxt, min-i+1);
		}
		System.out.println(maxt);
	}
	static long getDist(int i,int j) {
		int mid = (i+j)/2;
		long left = precl[i]-precl[mid]-(mid-i)*(L-X[mid]);
		long right = precr[j] - precr[mid]-(j-mid)*X[mid];
		return left+right;
	}
}
