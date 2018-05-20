package Douwei;
import java.io.*;
import java.util.*;
public class MinimumAbsoluteValue{
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	  static void findMinDiff(int[] arr, int n)
	  {
	        int diff = Integer.MAX_VALUE;
	        int idex =0;
	        int jdex =0;
	        for (int i=0; i<n-1; i++) {
	            for (int j=i+1; j<n; j++) {
	                if (Math.abs((arr[i] - arr[j]) )< diff) {
	                    diff = Math.abs((arr[i] - arr[j]));
	                    idex = i;
	                    jdex = j;
	                }
	            }   
	            }
	        System.out.println((idex+1)+" "+(jdex+1)+" "+diff);
	        					
	    }
    public static void main(String args[])throws IOException{
    	Scanner sc = new Scanner(System.in);
    	int n =readInt();
    	int arr[] = new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i] = readInt();
    	}
    	br.close();
   findMinDiff(arr,arr.length);
    }
        static String next() throws IOException{
            while(st==null||!st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }
        static long readLong() throws IOException{
            return Long.parseLong(next());
        }
        static int readInt() throws IOException{
            return  Integer.parseInt(next());
        }
         static double readDouble() throws IOException{
            return  Double.parseDouble(next());
        }
        static char readCharacter() throws IOException{
            return next().charAt(0);
        }
        static String readLine() throws IOException{
            return br.readLine().trim();
        }
    }