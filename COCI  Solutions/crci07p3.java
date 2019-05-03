import java.io.*;
public class crci07p3 {
	private static Reader in;
	private static PrintWriter out;
	
	private static int NUM_OF_TEST_CASES = 1; // TODO CHANGE NUMBER OF TEST CASES
	
	// TODO CHANGE FILE NAMES
	private static final String INPUT_FILE_NAME = "";
	private static final String OUTPUT_FILE_NAME = "";
	
    private static boolean crash = true;
    private static boolean flush = false;
    
	
	public static void main(String[]args) throws Exception {
		if (INPUT_FILE_NAME.equals("")) in = new Reader(System.in);
        else in = new Reader(INPUT_FILE_NAME);
        if (OUTPUT_FILE_NAME.equals("")) out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        else out = new PrintWriter(new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME)));
        for (int i = 1; i <= NUM_OF_TEST_CASES; i++) {
            try {
                run(i);
            } catch (Exception e) {
                System.err.println("Exception thrown on test case " + i);
                e.printStackTrace(System.err);
                out.flush();
                if (crash) throw new Exception();
            }
            if (flush) out.flush();
        }
        in.close();
        out.close();
		
	}
	static int x[], y[], sm[], pm[], sv[], pv[], N, M;
	public static void run(int testCaseNum) throws Exception {
		N = in.readInt(); M = in.readInt();
		x = new int[N]; y = new int[N];
	    sm = new int[N]; pm = new int[N]; sv = new int[N]; pv = new int[N];
		for(int i=0; i<N; i++) {
			x[i] = in.readInt(); y[i] = in.readInt();
			sm[i] = in.readInt(); pm[i] = in.readInt(); // smaller packages
			sv[i] = in.readInt(); pv[i] = in.readInt(); // bigger packages
		}
		int lo = 0, hi = 100000;
		while(lo < hi) {
			int m = (lo+hi)/2;
			if(!check(m))
				hi=m;
			else
				lo=m+1;
		}
		
		System.out.println(lo-1);
	}

	static boolean check(int amount) {
		long total=0;
		for(int i=0; i<N; i++) {
			int a = x[i]*amount-y[i];
			long min = 0x3f3f3f3f3f3fL;
			for(int j=0; j<=100000; j++) {
				// amount of money to buy is the value left after subtracting small total, then dividing by bigSize, then multiplt bigValue
				int price = (int)(j*pm[i] + Math.ceil((double)(a - j*sm[i]) / sv[i]) * pv[i]);
				min = Math.min(min, price);
			}
			total += min;
		}
		return total <= M;
	}
	static int ceil(double v) {
		return (int)(Math.ceil(v));
	}
	static void print(Object o) {
		out.print(o);
	}

	static void println(Object o) {
		out.println(o);
	}

	static void flush() {
		out.flush();
	}

	static void println() {
		out.println();
	}

	static void exit() throws IOException {
		in.close();
		out.close();
		System.exit(0);
	}
	static class Reader {
		
		final private static int BUFFER_SIZE = 1 << 16;
		private static DataInputStream din = new DataInputStream(System.in);
		private static byte[] buffer = new byte[BUFFER_SIZE];
		private static int bufferPointer = 0, bytesRead = 0;
		public Reader(InputStream stream) {
            din = new DataInputStream(stream);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
		}
		
        public Reader(String fileName) throws IOException {
            din = new DataInputStream(new FileInputStream(fileName));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
		
		public  String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = Read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}
		public  String read() throws IOException{
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
		public int readInt() throws IOException {
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
	
		public  long readLong() throws IOException {
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
	
		public  double readDouble() throws IOException {
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
	
		private  void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
	
		private  byte Read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
	
		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}
