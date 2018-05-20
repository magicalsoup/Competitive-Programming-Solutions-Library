package Douwei;
import java.util.*;
public class TwoDimensionArrayPractice5 {
    static int col;
    static int row;
    static int[][] trans_arr = new int[col][row];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col  = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr[0].length; i++) {
            int max = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int j = 0; j < arr.length; j++)
                if (arr[j][i] > max)
                    max = arr[j][i];
            for(int j=0;j<arr.length;j++)
            	if((arr[j][i]>max2&&arr[j][i]!=max)||(arr[j][i]>max2&&two(arr,arr[j][i])))
            		max2 = arr[j][i];
            System.out.print(max2+" ");
        } 
    }
    public static boolean two(int arr[][],int n) {
    	for(int i=0;i<arr[0].length;i++){
    	   	int count =0;
    		for(int j=0;j<arr.length;j++) {
    			if(arr[j][i] == n)
    				count++;
    		}
    		if(count>=2)
        		return true;
        }
    	return false;
    	}
}