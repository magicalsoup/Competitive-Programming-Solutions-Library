// took me a while, but yeah, finally figured it out, alot of explaining in this one
// the notes are made for you peter to undestant :p
import java.util.Scanner;
public class avatarair {
	static Scanner sc = new Scanner(System.in); // whynot static?
public static void main(String[]args) {
	int r = sc.nextInt(); // number of rows
	int c = sc.nextInt(); // number of columns
	char[][]m = new char[r+2][c+2];  // initialize grid
	char[][] db = new char[r+2][c+2]; // initialize DEBUG grid
	memset(m,'0');//fill m grid with 0's
	memset(db,'0');//fill debug grid with 0's
	
	//--------read input -------//
	for(int i=1;i<=r;i++) {
		String s = sc.next();
		for(int j=1;j<=c;j++) {
			m[i][j] = s.charAt(j-1);
			db[i][j] = m[i][j]; // copy m grid onto DEBUG grid
			}
		}
	//--------end of input-------//
	
	// starting DIRECTION of the leaf;
	char leaf = '>'; 
	// number of seconds
	//update(m); // start updating the grid;
	char finish  = '>'; // used to check if we exited or not
	db[1][2] = '>';
	int secs = 0;
	main : for(int i=1;i<=r;) { // main function to break when required
		for(int j=1;j<=c;) {
			//POSITION of the leaf
			char space = m[i][j];
			
			//----------print m grid----------//
				//print(m); // print the grid
			//--------------------------------//
			
			if(finish=='0') {
				// break when we exited the maze - break main;
				print(db);
				break main;
				}
			if(space=='/'){ // check if the mirror is facing this way '/'
				if(leaf=='>') { 
								//   ^
					leaf = '^'; //   | 
								//-->/
					// leaf will face UP after hitting the mirror
					db[i-1][j] = leaf; // DEBUG
					}
				else if(leaf=='<') {
					leaf = 'v'; // /<--				
								// |
								// v
					// leaf will face DOWN after hitting the mirror
					db[i+1][j] = leaf; // DEBUG
					}
				else if(leaf=='^') {
					leaf = '>'; // /-->
								//  ^
								//  |
					// leaf will face RIGHT after hitting the mirror
					db[i][j+1] = leaf; // DEBUG
					}
				else if(leaf=='v') {
					leaf = '<'; //    |
								//    v
								// <--/
					// leaf will face LEFT after hitting the mirror	
					db[i][j-1] = leaf; // DEBUG
					}
				
				}// end of 'if' statement to check for mirror type '/'
			
			else if(space==92) { //check if the mirror is this way '\'
				if(leaf=='>') {
					leaf = 'v'; // -->\
								//	  |
								//	  v
					//leaf will face DOWN after hitting the mirror
					db[i+1][j] = leaf; // DEBUG
					}
				else if(leaf=='<') {
					leaf = '^'; // ^
								// |
								// \<--
					//leaf will face UP after hitting the mirror
					db[i-1][j] = leaf; // DEBUG 
					}
				else if(leaf=='^') {
					leaf = '<'; // <--\
								//    ^
								//    |
					//leaf will face LEFT after hitting the mirror
					db[i][j-1] = leaf; // DEBUG
					}
				else if(leaf=='v') {
					leaf = '>'; // |
								// v
								// \-->
					//leaf will face RIGHT after hitting the mirror
					db[i][j+1] = leaf; // DEBUG
					}
				
				} // end of the if statement to check for  mirror type '\'
			//-----Check for direction we are moving and move in that direction-----//
			if(leaf=='>') { // move Right
				j++;
				update(m); // Update after each move
				secs++; // ADD 1 second after each move 
				finish = m[i][j]; // check if we exited the maze if we go RIGHT
				}
			else if(leaf=='v') { //move Down
				i++;
				update(m); // Update after each move
				secs++; // ADD 1 second after each move 
				finish = m[i][j]; // check if we exited the maze if we go DOWN
				}
			else if(leaf=='<') { // move Left
				j--;
				update(m); // Update after each move
				secs++; // ADD 1 second after each move 
				finish = m[i][j]; // check if we exited the maze if we go LEFT
				}
			else if(leaf=='^') { // move Up
				i--;
				update(m); // Update after each move
				secs++; // ADD 1 second after each move 
				finish = m[i][j]; // check if we exited the maze if we go UP
				}
			//--------------------------End of Direction Check-------------------------//
			
			//-------- print DEBUG grid--------//
				//print(db); // print DEBUG grid
			//---------------------------------//
			
			}// end of the j loop
		
		} // end of the i loop
	
	System.out.println(secs); // print out the time required

} // end of main

// method for printing the grid
public static void print(char[][]m) {
	for(int i=0;i<m.length;i++) {
		for(int j=0;j<m[i].length;j++) {
		System.out.print(m[i][j]);	
		}
		System.out.println();
	}
}
//method for updating the grid
public static void update(char[][]m) {
	for(int i=0;i<m.length;i++) {
		for(int j=0;j<m[i].length;j++) {
			if(m[i][j]==92) {
				m[i][j] = '/';
			}
			else if(m[i][j]=='/') {
				m[i][j] = (char)(92);
			}
		}
	}
}
// java version of the c++ memset, fills a 2D array
public static void memset(char m[][],char state) {
	for(int i=0;i<m.length;i++) {
		for(int j=0;j<m[i].length;j++) {
			m[i][j] = state;
			}
		}
	}
}// end of class
