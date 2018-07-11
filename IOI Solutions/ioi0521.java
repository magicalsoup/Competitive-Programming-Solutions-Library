 import java.util.*;
 import java.io.*;
    public class ioi0521{
      static InputReader br;
      static StringTokenizer st;
      public static void main(String[]args) throws IOException{
    	  br = new InputReader(System.in);
    	  int n = br.readInt();
    	  boolean[] containsF = new boolean[n];
    	  boolean[] containsR = new boolean[n];
    	  for(int i=1;i<=n;i++) {
    		  int x = br.readInt();
    		  containsF[(i-x+n)%n] = true;
    		  containsR[(i+x-1)%n] = true;
    	  }
    	  int max = 0;
    	  int curF = 0;
    	  int curR = 0;
    	  boolean inStreakF = false;
    	  boolean inStreakR = false;
    	  for(int i=0;i<n;i++)
    	  {
    		  if(inStreakF)
    		  {
    			  if(!containsF[i])
    				  curF++;
        		  else
        		  {
        			  inStreakF = false;
        			  if(curF>max)
        				  max = curF;
        		  		}
        		  }
    		  else if(!containsF[i])
    		  {
    			  curF = 1;
    			  inStreakF = true;
    		  }
    		  if(inStreakR)
    		  {
    			  if(!containsR[i])
    				  curR++;
    			  else
    			  {
    				  inStreakR = false;
    				  if(curR>max)
    					  max = curR;
    			  }
    		  }
    		  else if(!containsR[i])
    		  {
    			  curR = 1;
    			  inStreakR = true;
    		  }
    	  }
    	  if(curF>max)
    		  max = curF;
    	  if(curR>max)
    		  max = curR;
    	  System.out.println((n-max)/2);
    	  System.out.close();
      }
      // special reader that doesn't give me MLE
      static class InputReader {

  		private InputStream stream;
  		private byte[] buf = new byte[1<<10];
  		private int curChar;
  		private int numChars;

  		public InputReader(InputStream stream) {
  			this.stream = stream;
  		}

  		public int read() {
  			if (numChars == -1) {
  				System.exit(0);
  				throw new InputMismatchException();
  			}
  			if (curChar >= numChars) {
  				curChar = 0;
  				try {
  					numChars = stream.read(buf);
  				} catch (IOException e) {
  					throw new InputMismatchException();
  				}
  				if (numChars <= 0)
  					return -1;
  			}
  			return buf[curChar++];
  		}

  		public int readInt() {
  			int c = read();
  			while (isSpaceChar(c))
  				c = read();
  			int sgn = 1;
  			if (c == '-') {
  				sgn = -1;
  				c = read();
  			}
  			int res = 0;
  			do {
  				if (c < '0' || c > '9')
  					throw new InputMismatchException();
  				res *= 10;
  				res += c - '0';
  				c = read();
  			} while (!isSpaceChar(c));
  			return res * sgn;
  		}

  		public long readLong() {
  			int c = read();
  			while (isSpaceChar(c))
  				c = read();
  			int sgn = 1;
  			if (c == '-') {
  				sgn = -1;
  				c = read();
  			}
  			long res = 0;
  			do {
  				if (c < '0' || c > '9')
  					throw new InputMismatchException();
  				res *= 10;
  				res += c - '0';
  				c = read();
  			} while (!isSpaceChar(c));
  			return res * sgn;
  		}

  		public double readDouble() {
  			return Double.parseDouble(next());
  		}

  		public String readString() {
  			int c = read();
  			while (isSpaceChar(c))
  				c = read();
  			StringBuilder res = new StringBuilder();
  			do {
  				res.appendCodePoint(c);
  				c = read();
  			} while (!isSpaceChar(c));
  			return res.toString();
  		}

  		public boolean isSpaceChar(int c) {
  			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
  		}

  		public String next() {
  			return readString();
  		}
  	}
}
