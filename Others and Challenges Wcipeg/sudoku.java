import java.io.*;
public class sudoku {
	static int m[];
	static int bc[] = new int[512];
	static int mp[][] = new int[81][3];
	static char []r;
	static char[] init;
	static void recur() {
		int bv = 99;
		int bvv = -1;
		int bi = -1;
		for(int i=0;i<81;i++)
			if(r[i]==0) {
				int v = 511-(m[i]|m[mp[i][0]]|m[mp[i][1]]|m[mp[i][2]]);
				int t = bc[v];
				if(t<bv) {
					if(t==0)
						return;
					bv = t;
					bi = i; 
					bvv =v;
					if(t==1)
						break;
				}
			}
		if(bv==99) {
			int index =0;
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(r[index++]);
				}
				System.out.println();
			}
			throw new Error();
		}
			for(int i=0;i<9;i++)
				if(0!=(bvv&(1<<i))) {
					r[bi] = (char)('1'+i);
					m[mp[bi][0]]|=1<<i;
					m[mp[bi][1]]|=1<<i;
					m[mp[bi][2]]|=1<<i;
					recur();
					m[mp[bi][0]]&=~(1<<i);
					m[mp[bi][1]]&=~(1<<i);
					m[mp[bi][2]]&=~(1<<i);
					r[bi] = 0;
		}
	}
	static void solve(char[]initv) {
		m = new int[108];
		init = initv;
		for(int i=0;i<81;i++)
			if(init[i]>'0')
				m[i] = 511-(1<<(init[i]-'1'));
		r = new char[81];
		try {
			recur();
		}catch (Error e) {}
	}
	public static void main(String[]args)throws IOException{
		for(int i=1;i<512;i++)
			bc[i] = 1+bc[i&(1-i)];
		for(int i=0;i<81;i++) {
			mp[i][0] = 81+i%9;
			mp[i][1] = 90+i/9;
			mp[i][2] = 99+i/3%3*3+i/27;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index =0;
		char[]list = new char[81];
		while(index<81) {
			String s = br.readLine();
			for(int i =0;i<s.length();i++) {
				if(s.charAt(i)=='.'||Character.isDigit(s.charAt(i))) {
					list[index++] = s.charAt(i);
				}
			}
		}
		solve(list);
	}
}
