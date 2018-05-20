import java.util.*;
public class mockccc14s3{
	public static int [][]sort(int a[][],int b,int w,int l){
		int x =0;
		for(int z=0;z<l;z++) {
			for(int i=0;i<(l-1)-z;i++) {
				if(a[b][i]>a[b][i+1]) {
					for(int j=0;j<w;j++) {
						x = a[j][i];
						a[j][i] = a[j][i+1];
						a[j][i+1] = x;
					}
				}
			}
		}
		return a;
	}
     public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
    	 int r = scan.nextInt();
    	 int l = scan.nextInt();
    	 int spread[][] = new int[l][r];
    	 for(int i=0;i<r;i++) {
    		 for(int j=0;j<l;j++) {
    			 spread[j][i] = scan.nextInt();
    		 }
    	 }
    	 int n = scan.nextInt();
    	 for(int i=0;i<n;i++) {
    		 int b = scan.nextInt();
    		 sort(spread,b-1,l,r);
    	 }
    	 for(int i=0;i<r;i++) {
    		 for(int j=0;j<l;j++) {
    			 System.out.print(spread[j][i]+" ");
    		 }
    		 System.out.println("");
    	 }
     }
    }