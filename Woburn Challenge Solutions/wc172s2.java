import java.util.*;
import java.io.*;
public class wc172s2 {
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] tokens  = br.readLine().split(" ");
	int r =Integer.parseInt(tokens[0]);
	int c=  Integer.parseInt(tokens[1]);
	char[][]marsh = new char[r][c];
	int sx =0,sy =0,dx =0,dy =0;
	for(int i=0;i<r;i++) {
		String line = br.readLine();
		for(int j =0;j<c;j++) {
			marsh[i][j] = line.charAt(j);
			if(line.charAt(j)=='S') {
				sx = j;
				sy = i;
			}
			else if(line.charAt(j)=='D') {
				dx =j;
				dy = i;
			}
		}
	}
	boolean[][]U = new boolean[r][c];
	boolean[][]D = new boolean[r][c];
	boolean[][]L = new boolean[r][c];
	boolean[][]R = new boolean[r][c];
	/// UP
	for(int i=0;i<c;i++) {
		int temp =0;
		for(int j =0;j<r;j++) {
			if(marsh[j][i]=='*') {
				temp++;
			}
		}
		for(int j =r-1;j>=0;j--) {
			if(marsh[j][i]=='*') {
				U[j][i] = true;
				temp--;
			}
			else if(temp>=2) {
				U[j][i] = true;
			}
		}
	}
	/// DOWN
	for(int i=0;i<c;i++) {
		int temp =0;
		for(int j =r-1;j>=0;j--) {
			if(marsh[j][i]=='*') {
				temp++;
			}
		}
		for(int j =0;j<r;j++) {
			if(marsh[j][i]=='*') {
				D[j][i] = true;
				temp--;
			}
			else if(temp>=2) {
				D[j][i] = true;
			}
		}
	}
	/// RIGHT
	for(int i=0;i<r;i++) {
		int temp =0;
		for(int j =c-1;j>=0;j--) {
			if(marsh[i][j]=='*') {
				temp++;
			}
		}
		for(int j =0;j<c;j++) {
			if(marsh[i][j]=='*') {
				R[i][j] = true;
				temp--;
			}
			else if(temp>=2) {
				R[i][j] = true;
			}
		}
	}
	///LEFT
	for(int i=0;i<r;i++) {
		int temp =0;
		for(int j =0;j<c;j++) {
			if(marsh[i][j]=='*') {
				temp++;
			}
		}
		for(int j =c-1;j>=0;j--) {
			if(marsh[i][j]=='*') {
				L[i][j] = true;
				temp--;
			}
			else if(temp>=2) {
				L[i][j] = true;
			}
		}
	}
	boolean visited[][] = new boolean[r][c];
	ArrayList<Integer>X = new ArrayList<Integer>();
	ArrayList<Integer>Y = new ArrayList<Integer>();
	X.add(sx);
	Y.add(sy);
	visited[sy][sx] = true;
	int counter =0;
	int interval = 1;
	int out = Integer.MAX_VALUE;
	while(!X.isEmpty()) {
		int x =X.get(0);
		int y = Y.get(0);
		X.remove(0);
		Y.remove(0);	
		interval--;
		if(x==dx&&y==dy) {
			out = Math.min(counter, out);
			break;
		}
		if(y+1<r&&!D[y+1][x]&&marsh[y+1][x]!='*'&&!visited[y+1][x]) {
			X.add(x);
			Y.add(y+1);
			visited[y+1][x] = true;
		}
		if(y-1>=0&&!U[y-1][x]&&marsh[y-1][x]!='*'&&!visited[y-1][x]) {
			X.add(x);
			Y.add(y-1);
			visited[y-1][x] = true;
		}
		if(x+1<c&&!R[y][x+1]&&marsh[y][x+1]!='*'&&!visited[y][x+1]) {
			X.add(x+1);
			Y.add(y);
			visited[y][x+1] = true;
		}
		if(x-1>=0&&!L[y][x-1]&&marsh[y][x-1]!='*'&&!visited[y][x-1]) {
			X.add(x-1);
			Y.add(y);
			visited[y][x-1] = true;
		}
		if(interval==0) {
			interval = X.size();
			counter++;
		}
	}
	if(out==Integer.MAX_VALUE) {
		System.out.println("-1");
	}
	else {
		System.out.println(out);
	}
	}
}
