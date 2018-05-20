import java.io.*;
public class coci087p2 {
static int numRounds;
static char[]sven;
static int numfriends;
static char[][] friends;
public static void main(String[]args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	numRounds = Integer.parseInt(br.readLine());
	sven = br.readLine().toCharArray();
	numfriends = Integer.parseInt(br.readLine());
	friends = new char[numfriends+1][numRounds+1];
	for(int i=0;i<numfriends;i++) {
		friends[i] = br.readLine().toCharArray();
	}
	int real =0;
	int max =0;
	for(int i=0;i<numRounds;i++) {
		real+=score(i,sven[i]);
		max+=max(score(i,'R'),score(i,'P'),score(i,'S'));
	}
	System.out.println(real);
	System.out.println(max);
}
public static int score(int round,char sven) {
	int out =0;
	for( int i = 0; i < numfriends; ++i ) {
	      if( sven == friends[i][round] )  out++;
	      if( sven == 'P' && friends[i][round] == 'R' ) out += 2;
	      if( sven == 'S' && friends[i][round] == 'P' ) out += 2;
	      if( sven == 'R' && friends[i][round] == 'S' ) out += 2;
	   }
	return out;
}
public static int max(int x, int y,int z) {
	if(x>=y&&x>=z)return x;
	if(y>=x&&y>=z)return y;
	return z;
}
}
