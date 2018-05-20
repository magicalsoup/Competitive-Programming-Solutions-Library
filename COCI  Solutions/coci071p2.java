import java.io.*;
public class coci071p2{
	static BufferedReader br;
	static char[][] board = new char[7][7];
	public static void main(String[]args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<7;i++) {
			String line = br.readLine();
			for(int j=0;j<7;j++) {
				if(j>(line.length()-1)) {
					board[i][j]= ' ';
				}
				else {
					board[i][j] = line.charAt(j);
				}
			}
		}
		int count =0;
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
				if(board[i][j]=='.') {
					if(!(i+2 >=  7))if(board[i+2][j] == 'o' && board[i+1][j]=='o')count++;
			         if( !(i-2 < 0 ))if (board[i-2][j] == 'o' && board[i-1][j] == 'o')count++;
			         if( !(j-2 < 0)) if( board[i][j-2] == 'o' && board[i][j-1] == 'o' ) count++;
			         if(!(j+2 >= 7)) if( board[i][j+2] == 'o' && board[i][j+1] == 'o') count++;
				}
			}
		}
	System.out.println(count);
	}
}
