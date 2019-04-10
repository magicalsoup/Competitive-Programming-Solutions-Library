import java.util.*;
import java.io.*;
public class RangeSumQueries {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException {
		int n = readInt(), q = readInt();
		long a[] = new long[n+1];
		for(int i = 0; i < n; i++) a[i] = readInt();
		SegTree tree = new SegTree(a);
		
		for(int i = 0; i < q; i++) {
			int c = readInt();
			if(c == 1) {
				int idx = readInt(), v = readInt();
				tree.update(idx-1, v);
			}
			if(c == 2) {
				int l = readInt()-1, r = readInt()-1;
				pw.println(tree.sumRange(l, r));
			}
		}
		pw.close();
	}
	static String next() throws IOException {
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static class SegTree  { 
	    
	    
	    long[] tree;
	    int n;
	    public SegTree(long[] nums) {
	        if (nums.length > 0) {
	            n = nums.length;
	            tree = new long[n * 2];
	            buildTree(nums);
	        }
	    }
	    private void buildTree(long[] nums) {
	        for (int i = n, j = 0;  i < 2 * n; i++,  j++)
	            tree[i] = nums[j];
	        for (int i = n - 1; i > 0; --i)
	            tree[i] = tree[i * 2] + tree[i * 2 + 1];
	    }
	    public void update(int pos, int val) {
	        pos += n;
	        tree[pos] = val;
	        while (pos > 0) {
	            int left = pos;
	            int right = pos;
	            if (pos % 2 == 0) {
	                right = pos + 1;
	            } else {
	                left = pos - 1;
	            }
	            // parent is updated after child is updated
	            tree[pos / 2] = tree[left] + tree[right];
	            pos /= 2;
	        }
	    }
	    public long sumRange(int l, int r) {
	        // get leaf with value 'l'
	        l += n;
	        // get leaf with value 'r'
	        r += n;
	        long sum = 0;
	        while (l <= r) {
	            if ((l % 2) == 1) {
	               sum += tree[l];
	               l++;
	            }
	            if ((r % 2) == 0) {
	               sum += tree[r];
	               r--;
	            }
	            l /= 2;
	            r /= 2;
	        }
	        return sum;
	    }
	}
}
