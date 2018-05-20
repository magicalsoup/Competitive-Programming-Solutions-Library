package Douwei;
import java.util.LinkedList;
import java.util.Scanner;
public class FlippingWorld {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
while(a-->0) {
	int r = sc.nextInt();
	int c = sc.nextInt();
	int grid[][] = new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			grid[i][j] = sc.nextInt();
		}
	}
	if(flip(grid,r,c))
		System.out.println("go forward");
	else
		System.out.println("keep defending");
}
}
public static boolean flip(int b[][],int r,int c) {
	LinkedList<Integer> list = new LinkedList<Integer>();
	int a[][] = new int[r][c];
	for(int i=r-1;i>=0;i--) {
		for(int j=c-1;j>=0;j--) {
			list.add(b[i][j]);
		}
	}
	int flag = 1;
	int count =0;
	for(int i=0;i<r;i++) {
		for(int j =0;j<c;j++) {
			if(list.get(count)!=b[i][j]) {
				flag = 0;
			break;
			}
			count++;
		}
	}
	if(flag==1)
return true;
	else
		return false;
}
}/*
proper way
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b[] = new int[a];
        int c[] = new int[a];
        for (int i = 0; i < a; i++) {
            boolean t = true;
            b[i] = s.nextInt();
            c[i] = s.nextInt();
            int d[][] = new int[b[i]][c[i]];
            for (int j = 0; j < b[i]; j++) {
                for (int k = 0; k < c[i]; k++) {
                    d[j][k] = s.nextInt();
                }
            }
            int e[][] = new int[b[i]][c[i]];
            for (int j = 0; j < b[i]; j++) {
                for (int k = 0; k < c[i]; k++) {
                    e[j][k] = d[d.length - j - 1][d[j].length - k - 1];
                    if (e[j][k] != d[j][k]) {
                        t = false;
                    }
                }
            }
            if (t == true) {
                System.out.println("go forward");
            } else {
                System.out.println("keep defending");
            }
        }
    }
 
}
*/