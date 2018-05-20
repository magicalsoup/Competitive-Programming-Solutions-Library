import java.util.*;
import java.io.*;
public class coci097p2{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter ps = new PrintWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
     public static void main(String []args)throws IOException{
    int n = readInt();
    int power = (int)Math.pow(2,Math.ceil(Math.log(n)/Math.log(2)));
    int x =0;
    int count =0;
    for(int y =power;y!=0;y/=2,x++){
        if(n>=y){
            n-=y;
            count = x;
        }
    }
    System.out.println(power+" "+count);
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
         return Integer.parseInt(next());
     }
     static double readDouble() throws IOException{
         return Double.parseDouble(next());
     }
     static String readLine() throws IOException{
         return br.readLine().trim();
     }
}
