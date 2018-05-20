import java.util.*;
public class ccc10s2p6{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int [] map =new int[27];
		for(int i=0;i<27;i++)
		{
			char c = scan.nextLine().charAt(0);
			if(c=='_')
				map[i]=26;
			else
				map[i] = c-'A';
		}
		int N = scan.nextInt();
		scan.nextLine();
		ArrayList<Integer> cycle;
		int[] nextmap = new int[27];
		boolean [] done = new boolean[27];
		for(int i=0;i<27;i++)
			if(!done[i])
			{
				cycle = new ArrayList<Integer>();
				cycle.add(i);
				done[i] = true;
				int next = map[i];
				while(!done[next])
				{
					cycle.add(next);
					done[next] = true;
					next = map[next];
				}
				for(int j=0;j<cycle.size();j++)
					nextmap[cycle.get(j)]= cycle.get((j+N)%cycle.size());
			}
		String s =scan.nextLine();
		scan.close();	
		String output = "";
		for(int i=0;i<s.length();i++)
		{
			int ch;
			if(s.charAt(i)=='_')
				ch = 26;
			else
				ch = s.charAt(i)-'A';
			if(nextmap[ch]==26)
				output+='_';
			else
				output+=(char)('A' +nextmap[ch]);
		}
		System.out.println(output);
	}
}
