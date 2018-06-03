import java.util.*;
import java.io.*;
public class ioi9821 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		int num = readInt();
		ArrayList<event> horizontal = new ArrayList<event>();
		ArrayList<event> vertical = new ArrayList<event>();
		
		for(int i=0;i<num;i++) {
			int lx = readInt()+10000;
			int ly = readInt()+10000;
			int ux = readInt()+10000;
			int uy = readInt()+10000;
			vertical.add(new event(ly,lx,ux,0));
			vertical.add(new event(uy,lx,ux,1));
			horizontal.add(new event(lx,ly,uy,0));
			horizontal.add(new event(ux,ly,uy,1));
		}
		int [] hor = new int[20000];
		int [] ver = new int[20000];
		int ans = 0;
		Collections.sort(horizontal);
		Collections.sort(vertical);
		
		for(event e:horizontal) {
			if(e.f==0) {
				ans+=e.h -e.l;
				for(int i = e.l;i<e.h;i++) {
					hor[i]++;
				}
			}
			if(e.f==1) {
				for(int i=e.l;i<e.h;i++) {
					hor[i]--;
					if(hor[i]==0)
						ans++;
					else
						ans--;
				}
			}
		}
		for(event e:vertical) {
			if(e.f==0) {
				ans+=e.h - e.l;
				for(int i = e.l;i<e.h;i++) {
					ver[i]++;
				}
			}
			if(e.f==1) {
				for(int i= e.l;i<e.h;i++) {
					ver[i]--;
					if(ver[i]==0)
						ans++;
					else
						ans--;
				}
			}
		}
		out.println(ans);
		out.close();
	}
	static class event implements Comparable<event>{
		int p,l,h,f;
		public event(int p,int l,int h,int f) {
			this.p = p;
			this.l = l;
			this.h = h;
			this.f = f;
		}
		@Override
		public int compareTo(event o) {
			return p-o.p;
		}
	}
	static String next() throws IOException{
        while(st==null||!st.hasMoreTokens())
        st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static long readLong() throws IOException{
        return Long.parseLong(next());
    }
    static int readInt() throws IOException{
        return  Integer.parseInt(next());
    }
     static double readDouble() throws IOException{
        return  Double.parseDouble(next());
    }
    static char readCharacter() throws IOException{
        return next().charAt(0);
    }
    static String readLine() throws IOException{
        return br.readLine().trim();
    }
}
