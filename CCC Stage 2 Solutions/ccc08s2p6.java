import java.util.*;
import java.io.*;
//too slow for wcipeg , but good enough for dmoj
public class ccc08s2p6 {
	static BufferedReader br;
	static PrintWriter pw;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new OutputStreamWriter(System.out));
			int n = readInt();
			Delaunay dt = null;
			{
				int[][] p = new int[n][2];
				for(int i = 0; i < n; i++) {
					p[i][0] = 2 * readInt();
					p[i][1] = 2 * readInt();
				}
				dt = new Delaunay(p);
			}
			dt.delaunay();
			double ans = 0;
			for(int i = 0; i < n; i++) {
				State[] order = new State[dt.ret[i].size()];
				{
					int idx = 0;
					for(int out: dt.ret[i]) {
						order[idx++] = new State(Math.atan2(dt.p[out][1]-dt.p[i][1], dt.p[out][0]-dt.p[i][0]), out);
					}
					Arrays.sort(order);
					for(int j = 0; j < order.length; j++) {
						int k = j == order.length-1 ? 0 : j+1;
						int p1 = order[j].idx;
						int p2 = order[k].idx;
						if(!dt.ret[p1].contains(p2)) continue;
						double[] center = Delaunay.circumcenter(dt.p[i], dt.p[p1], dt.p[p2]);
						if(center != null) {
							double xx = center[0] - dt.p[i][0];
							double yy = center[1] - dt.p[i][1];
							ans = Math.max(ans, xx*xx+yy*yy);
						}
					}
				}
			}
			pw.println(Math.sqrt(ans)/2);
		pw.close();
		System.exit(0);
	}

	static class State implements Comparable<State> {
		public double arg;
		public int idx;
		public State(double a, int i) {
			arg=a;
			idx=i;
		}
		public int compareTo(State s) {
			if(arg != s.arg) return Double.compare(arg, s.arg);
			return idx - s.idx;
		}
	}

	static class Delaunay {
		TreeSet<Integer>[] ret;
		int[][] p;
		int[] hull;
		int[] lhsKill;
		int[] rhsKill;

		@SuppressWarnings("unchecked")
		public Delaunay(int[][] p) {
			this.p = p;
			hull = new int[150];
			lhsKill = new int[100];
			rhsKill = new int[100];
			ret = new TreeSet[p.length];
			for(int i = 0; i < ret.length; i++) {
				ret[i] = new TreeSet<Integer>();
			}
		}

		public static int cross(int ax, int ay, int bx, int by) {
			return ax * by - ay * bx;
		}

		public void sort(int l, int r) {
			int low = l;
			int high = r;
			int[] pivot = p[(low+high)/2];
			while(low <= high) {
				while(p[low][0] < pivot[0] || (p[low][0] == pivot[0] && p[low][1] < pivot[1])) {
					low++;
				}
				while(p[high][0] > pivot[0] || (p[high][0] == pivot[0] && p[high][1] > pivot[1])) {
					high--;
				}
				if(low <= high) {
					int[] t = p[low];
					p[low] = p[high];
					p[high] = t;
					low++;
					high--;
				}
			}
			if(l < high) {
				sort(l, high);
			}
			if(low < r) {
				sort(low, r);
			}
		}
		
		public void sort() {
			sort(0, p.length-1);
		}
		
		public void delaunay() {
			sort();
			build(0, p.length-1);
		}

		public void build(int l, int r) {
			if(r-l < 3) {
				ret[l].add(r);
				ret[r].add(l);
				if(r-l == 2) {
					int m = l+1;
					ret[l].add(m);
					ret[r].add(m);
					ret[m].add(l);
					ret[m].add(r);
				}
				return;
			}
			int mid = (l+r)/2;
			build(l, mid);
			build(mid+1, r);
			int hullSize = 0;
			for(int i = l; i <= r; i++) {
				while(hullSize > 1) {
					int lx = p[hull[hullSize-1]][0] - p[hull[hullSize-2]][0];
					int ly = p[hull[hullSize-1]][1] - p[hull[hullSize-2]][1];
					int rx = p[i][0] - p[hull[hullSize-2]][0];
					int ry = p[i][1] - p[hull[hullSize-2]][1];
					if(cross(lx, ly, rx, ry) < 0) {
						hullSize--;
					}
					else {
						break;
					}
				}
				hull[hullSize++] = i;
			}
			leftEnd = -1;
			rightEnd = -1;
			for(int i = hullSize-1; i >= 0; i--) {
				if(hull[i] <= mid && hull[i+1] > mid) {
					leftEnd = hull[i];
					rightEnd = hull[i+1];
					break;
				}
			}
			while(true) {
				ret[leftEnd].add(rightEnd);
				ret[rightEnd].add(leftEnd);
				leftCand = -1;
				threshold = 1e20;
				for(int out: ret[leftEnd]) {
					if(out != rightEnd) {
						analyze(out);
					}
				}
				for(int out: ret[rightEnd]) {
					if(out != leftEnd) {
						analyze(out);
					}
				}
				if(leftCand == -1) break;
				rightCand = leftCand <= mid ? rightEnd : leftEnd;
				int numKill = 0;
				for(int out: ret[leftEnd]) {
					if(out != rightEnd && intersect(p[leftCand], p[rightCand], p[leftEnd], p[out])) {
						lhsKill[numKill] = leftEnd;
						rhsKill[numKill++] = out;
					}
				}
				for(int out: ret[rightEnd]) {
					if(out != leftEnd && intersect(p[leftCand], p[rightCand], p[out], p[rightEnd])) {
						lhsKill[numKill] = out;
						rhsKill[numKill++] = rightEnd;
					}
				}
				if(leftCand <= mid) {
					leftEnd = leftCand;
				}
				else {
					rightEnd = leftCand;
				}
				for(int i = 0; i < numKill; i++) {
					ret[lhsKill[i]].remove(rhsKill[i]);
					ret[rhsKill[i]].remove(lhsKill[i]);
				}
			}
		}

		double threshold;
		int leftCand;
		int rightCand;
		int leftEnd, rightEnd;
		public void analyze(int id) {
			if(p[leftEnd][0] == p[rightEnd][0]) {
				if(p[id][0] > p[leftEnd][0]) return;
				double[] ret = circumcenter(p[id],p[leftEnd],p[rightEnd]);
				if(ret == null) return;
				if(-ret[0]>threshold) return;
				threshold = -ret[0];
				leftCand = id;
			}
			else {
				int leftx = p[id][0] - p[leftEnd][0];
				int lefty = p[id][1] - p[leftEnd][1];
				int rightx = p[rightEnd][0] - p[leftEnd][0];
				int righty = p[rightEnd][1] - p[leftEnd][1];
				if(cross(leftx, lefty, rightx, righty)>0) return;
				double[] ret = circumcenter(p[id],p[leftEnd],p[rightEnd]);
				if(ret == null) return;
				if(ret[1]>threshold) return;
				threshold = ret[1];
				leftCand = id;
			}
		}

		public static double[] lineline(int p11x, int p11y, int p12x, int p12y, int p21x, int p21y, int p22x, int p22y) {
			int a1 = p11y - p12y;
			int b1 = p12x - p11x;
			int a2 = p21y - p22y;
			int b2 = p22x - p21x;
			int d = a1*b2-a2*b1;
			if(d == 0) return null;
			long c1 = -p11x*a1 - p11y*b1;
			long c2 = -p21x*a2 - p21y*b2;
			return new double[]{(c1*b2-c2*b1)/(double)-d, (c1*a2-c2*a1)/(double)d};
		}

		public static double[] circumcenter(int[] p1, int[] p2, int[] p3) {
			int mid2x = (p1[0] + p2[0])/2;
			int mid2y = (p1[1] + p2[1])/2;
			int p22x = (mid2x + -(p2[1] - mid2y));
			int p22y = (mid2y + p2[0] - mid2x);

			int mid3x = (p1[0] + p3[0])/2;
			int mid3y = (p1[1] + p3[1])/2;
			int p32x = (mid3x + -(p3[1] - mid3y));
			int p32y = (mid3y + p3[0] - mid3x);

			return lineline(mid2x, mid2y, p22x, p22y, mid3x, mid3y, p32x, p32y);
		}

		public static boolean twoside(int[] p11, int[] p12, int[] p21, int[] p22){
			int p1211x = p12[0] - p11[0];
			int p1211y = p12[1] - p11[1];
			int p2111x = p21[0] - p11[0];
			int p2111y = p21[1] - p11[1];
			int p2211x = p22[0] - p11[0];
			int p2211y = p22[1] - p11[1];

			int v1 = cross(p1211x, p1211y, p2111x, p2111y);
			int v2 = cross(p1211x, p1211y, p2211x, p2211y);
			return (v1 < 0 && v2 > 0) || (v1 > 0 && v2 < 0);
		}

		public static boolean intersect(int[] p11, int[] p12, int[] p21, int[] p22){
			return twoside(p11, p12, p21, p22) && twoside(p21, p22, p11, p12);
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
