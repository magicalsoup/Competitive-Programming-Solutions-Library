package Douwei;
import java.util.Scanner;
public class SelectYourSeat{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int last = sc.nextInt();
		int grid[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(grid[i][j]==0) {
					last--;
				}
				if(last==0) {
					System.out.println((i+1)+" "+(j+1));
				return;
				}
			}
		}
	}
        }