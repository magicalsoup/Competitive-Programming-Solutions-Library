import java.util.*;
import java.io.*;
public class ccoqr16p2{

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  static int N;

  public static void main (String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
	    int n = readInt();
	    int [] deg = new int[n];
	    int[][] g = new int[n][];
	    int[] count = new int[n];
	    int[][] listR = new int[n][];
	    int[][] listC = new int[n][];
	    int m = 0;
	    String[] line;
	    for(int i=0;i<n;i++)
	    {
	    	line = readLine().split(" ");
	    	deg[i] = Integer.parseInt(line[0]);
	    	m+=deg[i];
	    	
	    	g[i] = new int[deg[i]];
	    	listR[i] = new int[deg[i]];
	    	listC[i] = new int[deg[i]];
	    	for(int j=0;j<deg[i];j++)
	    		g[i][j] = Integer.parseInt(line[j+1])-1;
	    }
	    for(int i=0;i<n;i++)
	    	for(int j=0;j<deg[i];j++)
	    	{
	    		listR[g[i][j]][count[g[i][j]]]= i;
	    		listC[g[i][j]][count[g[i][j]]] = j;
	    		count[g[i][j]]++;
	    	}
	    int[] temp = new int[m+1];
	    int[][] cor = new int[n][];
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<deg[i];j++)
	    		temp[listR[i][j]] = listC[i][j];
	    
	    	cor[i] = new int[deg[i]];
	    	for(int j=0;j<deg[i];j++)
	    		cor[i][j] = temp[g[i][j]];
	    }
	    //	now g and cor combined represent the entire destination, including
	    // 	the position in the destination room
	    
	    boolean[][] visited = new boolean[n][];
	    for(int i=0;i<n;i++)
	    	visited[i] = new boolean[deg[i]];
	    
	    int[] maxTrav = new int[n];
	    int[] timer = new int[n];
	    for(int startI=0;startI<n;startI++)
	    	for(int startJ =0;startJ<deg[startI];startJ++) 
	    		if(!visited[startI][startJ])
	    		{
	    			int i = startI;
	    			int j = startJ;
	    			int len = 0;
	    			while(!visited[i][j])
	    			{
	    				visited[i][j] = true;
	    				temp[len] = i;
	    				len++;
	    				
	    				j++;
	    				if(j==deg[i])
	    					j = 0;
	    				int t = g[i][j];
	    				j = cor[i][j];
	    				i = t;
	    			}
	    			for(int k=0;k<len;k++)
	    			{
	    				timer[temp[k]] = -1;
	    			}
	    			int laps = 0;
	    			int t = 0;
	    			for(int k=0;laps<2;k++)
	    			{
	    				if(k==len)
	    				{
	    					k = 0;
	    					laps++;
	    				}
	    				if(timer[temp[k]]>=0 &&(t-timer[temp[k]])>maxTrav[temp[k]])
	    					maxTrav[temp[k]] = t-timer[temp[k]];
	    				timer[temp[k]] = t;
	    				t++;
	    			}
	    		}
	    		int q = readInt();
	    		for(int i=0;i<q;i++) {
	    			int r = readInt()-1;
	    			System.out.println(maxTrav[r]);
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

		  static char readCharacter () throws IOException {
		    return next().charAt(0);
		  }

		  static String readLine () throws IOException {
		    return br.readLine().trim();
		  }
}
