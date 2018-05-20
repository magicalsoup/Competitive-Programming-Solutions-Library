//faster reader and program then the first one
import java.util.*;
import java.io.*;

public class ccc09s4_2 {
static class Reader {
			final private int BUFFER_SIZE = 1 << 16;
			private DataInputStream din;
			private byte[] buffer;
			private int bufferPointer, bytesRead;
			public Reader() {
				din = new DataInputStream(System.in);
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
			public Reader(String file_name) throws IOException {
				din = new DataInputStream(new FileInputStream(file_name));
				buffer = new byte[BUFFER_SIZE];
				bufferPointer = bytesRead = 0;
			}
			public String readLine() throws IOException {
				byte[] buf = new byte[64]; // line length
				int cnt = 0, c;
				while ((c = read()) != -1) {
					if (c == '\n')
						break;
					buf[cnt++] = (byte) c;
				}
				return new String(buf, 0, cnt);
			}
			public int nextInt() throws IOException {
				int ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do {
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
				if (neg)
					return -ret;
				return ret;
			}
			public long nextLong() throws IOException {
				long ret = 0;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do {
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
				if (neg)
					return -ret;
				return ret;
			}
			public double nextDouble() throws IOException {
				double ret = 0, div = 1;
				byte c = read();
				while (c <= ' ')
					c = read();
				boolean neg = (c == '-');
				if (neg)
					c = read();
				do {
					ret = ret * 10 + c - '0';
				} while ((c = read()) >= '0' && c <= '9');
				if (c == '.') {
					while ((c = read()) >= '0' && c <= '9') {
						ret += (c - '0') / (div *= 10);
					}
				}
				if (neg)
					return -ret;
				return ret;
			}
			private void fillBuffer() throws IOException {
				bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
				if (bytesRead == -1)
					buffer[0] = -1;
			}
			private byte read() throws IOException {
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

    public static void main(String[] args) throws Exception{
       Reader c = new Reader();
       int N = c.nextInt(), T = c.nextInt();
       short adj[][] = new short[N+1][N+1];  
       for(int i = 0; i<T; i++){
           int x = c.nextInt();
           int y = c.nextInt();
           int z = c.nextInt();
           adj[x][y] = (short)z; adj[y][x] =(short) z;
       }
       int P = c.nextInt();
       int city[] = new int[P+1], price[] = new int[P+1];
       for(int i = 0 ; i<P; i++){
          city[i] = c.nextInt(); price[i] = c.nextInt();         
       }       
       int D = c.nextInt();
       int dis[] = new int[N+1];
       boolean vis[] = new boolean[N+1];
       Arrays.fill(dis,Integer.MAX_VALUE);
       dis[D] = 0;
       
       for(int t = 1; t<=N; t++){
           int MIN = Integer.MAX_VALUE, idx = -1;
           for(int i = 1; i<=N; i++){
               if(!vis[i] && dis[i] <MIN){
                   MIN = dis[i]; idx = i;
               }
           }
           if(idx == -1){
               break;
           }
           vis[idx] = true;
           for(int v = 1; v<= N; v++){
               if(adj[idx][v] > 0 && dis[v] > dis[idx] + adj[idx][v])
                   dis[v] = dis[idx] + adj[idx][v];
           }
       }
       
       int ans = Integer.MAX_VALUE;
       for(int i = 0; i<P; i++){
           if(dis[city[i]]!= Integer.MAX_VALUE)
               ans = Math.min(ans, price[i] + dis[city[i]]);
       }
       System.out.println(ans);
       
       
       
    }
    
}
