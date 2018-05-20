package Douwei;
import java.util.*;
public class TravellingTheGridAgain{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[][]grid =new int[n][m];
        for(int i=0; i<k;i=i+1){
            int a=sc.nextInt();
            int b=sc.nextInt();
            grid[b-1][a-1]=1;
        }
        System.out.println(paths(n,m,grid));
        }
    public static int paths (int n, int m,int[][]b){
            if(n==1 && m==1)return 1;
            if(b[n-1][m-1]==1)return 0;
            if(n==1)return paths(n,m-1,b);
            if(m==1)return paths(n-1,m,b);
            return paths(n-1,m,b)+paths(n,m-1,b);
        }
    }