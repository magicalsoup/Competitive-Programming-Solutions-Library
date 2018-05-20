import java.util.*;
public class ccc07s2p6{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int N =sc.nextInt();
	int R = sc.nextInt();
	boolean[] deleted = new boolean[N];
	boolean[] visited = new boolean[N];
	boolean[][]g =new boolean[N][N];
	int[][]detour = new int[N][N];
	for(int m=0;m<R;m++)
	{
		int v = sc.nextInt()-1;
		int w = sc.nextInt()-1;
		g[v][w] = true;
		g[w][v] = true;
	}
	sc.close();
	Stack<Integer> st=  new Stack<Integer>();
	st.add(0);
	while(!st.isEmpty()) {
		int i = st.pop();
		st.push(i);
		visited[i] = true;
		boolean done = true;
		for(int j=0;j<st.size()-1&&done;j++)
		{
			int x =st.get(j);
			if((g[i][x]||detour[i][x]>0)&&(j<st.size()-2||detour[i][x]>1||g[i][x]&&detour[i][x]>0)) {
				done = false;
				for(int k = st.size()-1;k>j;k--)
				{
					int y = st.get(k);
					deleted[y] = true;
					for(int l=0;l<N;l++)
					{
						if(g[y][l])
						{
							detour[x][l]++;
							detour[l][x]++;
						}
						detour[x][l]+=detour[y][l];
						detour[l][x]+=detour[y][l];
					}
					st.pop();
				}
			}
		}
		for(int j=0;j<N&&done;j++)
			if((g[i][j]||detour[i][j]>0)&&!deleted[j]&&!visited[j])
			{
				done = false;
				st.push(j);
			}
		if(done) 
			st.pop();
		}
		int count =0;
		for(int i=0;i<N;i++)
			if(!deleted[i])
			{
				int c =0;
				for(int j=0;j<N;j++)
					if(i!=j&&!deleted[j])
					{
						if(g[i][j] ||detour[i][j]>0)
							c++;
					}
				if(c==1)
					count++;
			}
		System.out.println((count+1)/2);
	}
}
