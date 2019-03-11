import java.io.*;
import java.util.*;
public class ecoo12r1p4 {
	static boolean found = false; 
	static int move[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};
	static boolean vis[][] = new boolean[4][4];
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[]args) throws IOException{
		
		for(int t = 0; t < 5; t++) {
			char g[][] = new char[4][4];
			
			for(int i = 0; i < 4; i++) g[i] = next().toCharArray();
			
			int n = readInt(); checker c = new checker(0, 0, 0, 0, 0);
			for(int i = 0; i < n; i++) {
				found = false; 
				String s = next(); 
	
				if(s.length() < 3) {
					c.addTooShort();
					continue;
				}
				else if(c.isRepeated(s)) { 
					c.addRepeated(); 
					continue;
				}
				main: for(int j = 0; j < 4; j++) {
					for(int k = 0; k < 4; k++) {
						if(g[j][k] == s.charAt(0)) {
							found = findWord(j, k, s, g, 0);
							if(found) {
								c.calculateScore(s);
								c.addWordToList(s);
								c.addWord();
								break main;
							}
						}
					}
				}
				if(!found) {
					c.addNotFound(); 
					c.addWordToList(s);
				}
			}
			System.out.println("Your score: " + c.points + " (" + c.words + " good, " + c.notFound + " not found, " + c.tooShort + " too short, " + c.repeated + " repeated)");
			
		}
	}
	static boolean findWord(int x, int y, String s, char g[][], int lev) {
		int len = s.length();
		if(len == lev) return true;
		if(x < 0 || y < 0 || x >= 4 || y >= 4) return false;
		
		if(g[x][y] == s.charAt(lev)) {
			char temp = g[x][y]; g[x][y] = '#';
			
			 
			boolean	res = findWord(x + 1, y, s, g, lev + 1) |
						  findWord(x - 1, y, s, g, lev + 1) |
						  findWord(x, y + 1, s, g, lev + 1) |
						  findWord(x, y - 1, s, g, lev + 1) |
						  findWord(x + 1, y + 1, s, g, lev + 1) |
						  findWord(x - 1, y - 1, s, g, lev + 1) |
						  findWord(x + 1, y - 1, s, g, lev + 1) |
						  findWord(x -1, y + 1, s, g, lev + 1);
			
			g[x][y] = temp;
			return res;
		}
		else return false;
		
	
	}
	static String next() throws IOException{
		while(st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException{
		return Integer.parseInt(next());
	}
	static class checker{
		int points, words, notFound, tooShort, repeated;
		LinkedList<String> list = new LinkedList<String>();
		public checker(int points, int words, int notFound, int tooShort, int repeated) {
			this.points = points;
			this.words = words;
			this.notFound = notFound;
			this.tooShort = tooShort;
			this.repeated = repeated;
		}
		public void calculateScore(String s) {
			if(s.length() == 3 || s.length() == 4) points+=1;
			else if(s.length() == 5) points += 2;
			else if(s.length() == 6) points += 3;
			else if(s.length() == 7) points += 4;
			else if(s.length() > 7) points += 11;
		}
		public void addWord() {
			words+=1;
		}
		public void addWordToList(String s) {
			list.add(s);
		}
		public void addNotFound() {
			notFound+=1;
		}
		public void addTooShort() {
			tooShort+=1;
		}
		public void addRepeated() {
			repeated+=1;
		}
		public boolean isRepeated(String s) {
			return list.contains(s);
		}
	}
}
