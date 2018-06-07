import java.util.*;
import java.io.*;
    public class ioi9413{
      static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      static StringTokenizer st;
      static int [][] grid;
      static int [] div;
      static ArrayList<Integer>[] primes;
      static TreeSet<State> ret;
      static boolean [] can;
      static int sum;
      @SuppressWarnings("unchecked")
	public static void main(String[]args) throws IOException{
      can = new boolean[100000];
      div = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,
    		  107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,
    		  229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317};
      ret = new TreeSet<State>();
      primes = new ArrayList[10];
      for(int i=0;i<10;i++) {
    	  primes[i] = new ArrayList<Integer>();
      }
      grid = new int[5][5];
      for(int i=0;i<5;i++)
    	  Arrays.fill(grid[i], 10);
      sum = readInt();
      if(sum%2==0) {
    	out.println("NONE");
    	out.close();
    	return;
      	}
      grid[0][0] = readInt();
      get(1,4,sum-1);
      get(3,4,sum-3);
      get(5,4,sum-5);
      get(7,4,sum-7);
      get(9,4,sum-9);
      get(2,4,sum-2);
      get(4,4,sum-4);
      get(6,4,sum-6);
      get(8,4,sum-8);
      for(int i=1;i<primes.length;i++) {
    	Collections.sort(primes[i]);
    	for(int out:primes[i])
    		can[out] = true;
      	}
      solve();
      if(ret.size()==0) {
    	  out.println("NONE");
    	  out.close();
    	  return;
      	}
      int c = 0;
      for(State curr:ret) {
    	 out.print(curr);
    	 c++;
    	 if(c!=ret.size())
    		 out.println();
      	}
      out.close();
      System.exit(0);
      }
      public static int extract(int num,int p) {
    	  while(p-->0) {
    		  num/=10;
    	  }
    	  return num % 10;
      }
      public static void solve() {
    	  for(int out: primes[grid[0][0]]) {
    		  for(int k = 1;k<5;k++) {
    			  grid[k][k] = extract(out, 4-k);
    		  }
    		  solve2();
    	  }
      }
      public static void solve2() {
    	  for(ArrayList<Integer> temp:primes) {
    		  for(int out:temp) {
    			  if(extract(out,4)%2!=0&&extract(out,2)==grid[2][2]) {
    				  int num = out;
    				  grid[0][4] = num%10;
    				  num/=10;
    				  grid[1][3] = num%10;
    				  num/=100;
    				  grid[3][1] = num%10;
    				  num/=10;
    				  grid[4][0] = num%10;
    				  solve3();
    			  }
    		  }
    	  }
      }
      public static void solve3() {
    	  for(int out:primes[grid[0][0]]) {
    		  if(out%10==grid[0][4]) {
    			  for(int k =1;k<4;k++) {
    				  grid[0][k]=  extract(out,4-k);
    			  }
    			  solve4();
    		  }
    	  }
      }
      public static void solve4() {
    	  for(int out:primes[grid[0][1]]) {
    		  if(extract(out,3)==grid[1][1]&&extract(out,1)==grid[3][1]) {
    			  grid[2][1] = extract(out,2);
    			  grid[4][1] = out%10;
    			  for(int out2:primes[grid[0][3]]) {
    				  if(extract(out2,3)==grid[1][3]&&extract(out2,1)==grid[3][3]) {
    					  grid[2][3] = extract(out2, 2);
    					  grid[4][3] = out2%10;
    					  solve5();
    				  }
    			  }
    		  }
    	  }
      }
      public static void solve5() {
    	  grid[4][2] = sum-grid[4][0]-grid[4][1]-grid[4][3]-grid[4][4];
    	  if(grid[4][2]<0||grid[4][2]>9) 
    		  return;
    	  if(!can[10000*grid[4][0]+1000*grid[4][1]+100*grid[4][2]+10*grid[4][3]+grid[4][4]])
    		  return;
    	  for(int out:primes[grid[0][2]]) {
    		  if(extract(out,2)==grid[2][2]&&out%10==grid[4][2]) {
    			  grid[1][2] = extract(out,3);
    			  grid[3][2] = extract(out,1);
    			  solve6();
    		  }
    	  }
      }
      public static void solve6() {
    	  for(int i =10;i<100;i++) {
    		  int test = 10000*(i/10)+1000*grid[1][1]+100*grid[1][2]+10*grid[1][3]+(i%10);
    		  if(can[test]) {
    			  grid[1][0] = i/10;
    			  grid[1][4] = i%10;
    			  solve7();
    		  }
    	  }
      }
      public static void solve7() {
    	  for(int i=10;i<100;i++) {
    		  int test = 10000*	(i/10)+1000+grid[3][1]+100*grid[3][2]+10*grid[3][3]+(i%10);
    		  if(can[test]) {
    			  grid[3][0] = i/10;
    			  grid[3][4] = i%10;
    			  solve8();
    		  }
    	  }
      }
      public static void solve8() {
    	  grid[2][0] = sum-grid[0][0]-grid[1][0]-grid[3][0]-grid[4][0];
    	  if(grid[2][0]<0||grid[2][0]>9)
    		  return;
    	  if(!can[10000*grid[0][0]+1000*grid[1][0]+100*grid[2][0]+10*grid[3][0]+grid[4][0]])
    		  return;
    	  grid[2][4] = sum-grid[0][4]-grid[1][4]-grid[3][4]- grid[4][4];
    	  if(grid[2][4]<0||grid[2][4]>9)
    		  return;
    	  if(!can[10000*grid[0][4]+1000*grid[1][4]+100*grid[2][4]+10*grid[3][4]+grid[4][4]])
    		  return;
    	  if(!can[10000*grid[2][0]+1000*grid[2][1]+100*grid[2][2]+10*grid[2][3]+grid[2][4]])
    		  return;
    	  ret.add(new State(grid));
      }
      public static boolean prime(int x) {
    	  for(int curr:div) {
    		  if(x%curr==0)
    			  return false;
    		  if(curr*curr>x)
    			  return true;
    	  }
    	  return true;
      }
      public static void get(int curr,int left,int total) {
    	  if(9*left<total)
    		  return;
    	  if(total<0)
    		  return;
    	  if(left==0) {
    		  if(total!=0)
    			  return;
    		  if(prime(curr)) {
    			  primes[curr/10000].add(curr);
    		  }
    	  }
    	  else {
    		  if(left==1)
    			  if(total%2==0)
    				  return;
    		  get(10*curr,left-1,total);
    		  get(10*curr+1,left-1,total-1);
    		  get(10*curr+2,left-1,total-2);
    		  get(10*curr+3,left-1,total-3);
    		  get(10*curr+4,left-1,total-4);
    		  get(10*curr+5,left-1,total-5);
    		  get(10*curr+6,left-1,total-6);
    		  get(10*curr+7,left-1,total-7);
    		  get(10*curr+8,left-1,total-8);
    		  get(10*curr+9,left-1,total-9);
    	  }
      }
      static class State implements Comparable<State>{
    	  public int [][] grid;
    	  public State(int [][]a) {
    		  grid = new int[5][5];
    		  for(int i=0;i<5;i++)
    			  for(int j=0;j<5;j++)
    				  grid[i][j] = a[i][j];
    	  }
    	  public int compareTo(State s) {
    		  for(int i=0;i<5;i++)
    			  for(int j=0;j<5;j++)
    				  if(grid[i][j]!=s.grid[i][j])
    					  return grid[i][j]-s.grid[i][j];
    		  return 0;
    	  }
    	  public String toString() {
    		  StringBuilder sb = new StringBuilder();
    		  for(int i=0;i<5;i++) {
    			  for(int j=0;j<5;j++)
    				  sb.append(grid[i][j]%10);
    			  sb.append("\n");
    		  }
    		  return sb.toString();
    	  }
		}
  static String next () throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong () throws IOException {
    return Long.parseLong(next());
  }

  static int readInt () throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble () throws IOException {
    return Double.parseDouble(next());
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
    } 
  }
