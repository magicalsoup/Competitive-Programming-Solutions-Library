import java.util.*;
import java.io.*;
public class ccc10s2p3{
	public static int N, MM=1000010, mask=(1<<20)-1, cnt=0, x[]=new int[MM], y[] = new int[MM];
	public static int bit[]=new int[MM], rk[]=new int[MM], id[]=new int[MM];
	public static long s[] = new long [MM]; 
	public static String op[]=new String[MM];
	public static void main(String[] args) throws IOException {
		N = readInt();
		for(int i=1; i<=N; i++){
			op[i] = read(); x[i]=readInt();
			if(op[i].charAt(0) != 'Q'){
				y[i] = readInt(); s[i] = ((long)y[i]<<20) | i; 
			}else s[i] = i;
		}
		Arrays.sort(s, 1, N+1);
		for(int i=N; i>0; i--) rk[(int)(s[i] & mask)] = ++cnt;
		for(int i=1; i<=N; i++){
			if(op[i].charAt(0) == 'N'){
				update(rk[i], 1); id[rk[i]]=x[i]; y[x[i]] = rk[i];
			}else if(op[i].charAt(0) == 'M'){
				update(y[x[i]], -1); update(rk[i], 1); id[rk[i]]=x[i]; y[x[i]]=rk[i];
			}else{
				println(id[find_k(x[i])]);
			}
		}
		exit();
	}
	public static void update(int pos, int v){
		for(int i=pos; i<=N; i+=i&-i) bit[i] += v;
	}
	public static int find_k(int k){
		int pos = 0, cnt = 0;
		for(int i=20; i>=0; i--){
			pos += (1<<i);
			if(pos >= N || cnt + bit[pos] >= k) pos -= (1<<i);
			else cnt += bit[pos];
		}
		return pos+1;
	}
	final private static int BUFFER_SIZE = 1 << 16;
	private static DataInputStream din = new DataInputStream(System.in);
	private static byte[] buffer = new byte[BUFFER_SIZE];
	private static int bufferPointer = 0, bytesRead = 0;
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

	public static String readLine() throws IOException {
		byte[] buf = new byte[64]; // line length
		int cnt = 0, c;
		while ((c = Read()) != -1) {
			if (c == '\n')
				break;
			buf[cnt++] = (byte) c;
		}
		return new String(buf, 0, cnt);
	}
	public static String read() throws IOException{
		byte[] ret = new byte[1024];
        int idx = 0;
        byte c = Read();
        while (c <= ' ') {
            c = Read();
        }
        do {
            ret[idx++] = c;
            c = Read();
        } while (c != -1 && c != ' ' && c != '\n' && c != '\r');
        return new String(ret, 0, idx);
	}
	public static int readInt() throws IOException {
		int ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (neg)
			return -ret;
		return ret;
	}

	public static long readLong() throws IOException {
		long ret = 0;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();
		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');
		if (neg)
			return -ret;
		return ret;
	}

	public static double readDouble() throws IOException {
		double ret = 0, div = 1;
		byte c = Read();
		while (c <= ' ')
			c = Read();
		boolean neg = (c == '-');
		if (neg)
			c = Read();

		do {
			ret = ret * 10 + c - '0';
		} while ((c = Read()) >= '0' && c <= '9');

		if (c == '.') {
			while ((c = Read()) >= '0' && c <= '9') {
				ret += (c - '0') / (div *= 10);
			}
		}

		if (neg)
			return -ret;
		return ret;
	}

	private static void fillBuffer() throws IOException {
		bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
		if (bytesRead == -1)
			buffer[0] = -1;
	}

	private static byte Read() throws IOException {
		if (bufferPointer == bytesRead)
			fillBuffer();
		return buffer[bufferPointer++];
	}

	public void close() throws IOException {
		if (din == null)
			return;
		din.close();
	}

	static void print(Object o) {
		pr.print(o);
	}

	static void println(Object o) {
		pr.println(o);
	}

	static void flush() {
		pr.flush();
	}

	static void println() {
		pr.println();
	}

	static void exit() throws IOException {
		din.close();
		pr.close();
		System.exit(0);
	}
}
