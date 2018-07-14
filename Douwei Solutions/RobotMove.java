package Douwei;
import java.util.Scanner;
	public class RobotMove {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int e = sc.nextInt();
			int k = sc.nextInt();
			int steps = 0;
			while(true) {
				if(x==e&&y==k)
					break;
				int com = sc.nextInt();
				steps++;
				if(com==1) {
					if(y<10)
						y++;
				}
				if(com==2) {
					if(y>1) 
						y--;
				}
				if(com==3) {
					if(x>1) 
						x--;
				}
				if(com==4) {
					if(x<10) 
						x++;
				}
				//System.out.println("X is "+x+" Y is "+y+" steps is "+steps);
			}
			System.out.println("Total Steps: "+steps);
			sc.close();
		}
	}
