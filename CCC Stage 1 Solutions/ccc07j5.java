import java.util.*;
public class ccc07j5{
	static 	int motel[];
	static int ways =0;
	static int min,max,size, n;
		public static boolean between(int a,int b, int c) {
			return  a<=b&&b<=c;
		}
		public static int findpaths(int distance) {
			if(distance==7000) {
				ways++;
			}
			else {
				for(int i=1;i<=size;i++) {
					if(between(min,motel[i]-distance,max)) {
						findpaths(motel[i]);
					}
				}
			}
			return ways;
		}
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	size = 13;
	motel = new int[50];
	motel[1] = 990;
	motel[2] = 1010;
	motel[3] = 1970;
	motel[4] = 2030;
	motel[5] = 2940;
	motel[6] = 3060;
	motel[7] = 3930;
	motel[8] = 4060;
	motel[9] = 4970;
	motel[10] = 5030;
	motel[11] = 5990;
	motel[12] = 6010;
	motel[13] = 7000;
	min = sc.nextInt();
	max = sc.nextInt();
	n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		motel[i+size] = sc.nextInt();
	}
	size = size+n;
	findpaths(0);
	System.out.print(ways);
}
}

