package Douwei;
// this is from the ccc 2007 stage 2 question 
import java.util.*;
import java.io.*;
public class SnowflakeSnowSnowflakes{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        int n = readInt();
        int[][]snowflakes = new int[n][6];
        for(int x =0;x<n;x++) {
            int min=  Integer.MAX_VALUE;
            int[]s = new int[6];
            int []mins = new int[6];
            for(int y =0;y<6;y++) {
                s[y] =readInt();
                min = Math.min(min, s[y]);
                mins[y] = Integer.MAX_VALUE;
            }
            for(int y= 0;y<6;y++) {
                if(s[y]==min) {
                    int curr[] = new int[6];
                    for(int z = y;z<y+6;z++)
                        curr[z-y] = s[z%6];
                if(compare(mins,curr)==-1)
                    mins = Arrays.copyOf(curr, curr.length);
                for(int z =y;z>y-6;z--)
                    curr[y-z] = s[(z+6)%6];
                if(compare(mins,curr)==-1)
                    mins = Arrays.copyOf(curr, curr.length);
                }
            }
            snowflakes[x] = Arrays.copyOf(mins, mins.length);
        }
        Arrays.sort(snowflakes,new Comparator<int[]>() {
            @Override
            public int compare(int[]o1, int []o2) {
                for(int x =0;x<6;x++) {
                    if(o1[x]!=o2[x])
                        return o1[x]-o2[x];
                }
                return 0;
            }
        });
        for(int x=0;x<n-1;x++) {
            if(compare(snowflakes[x],snowflakes[x+1])==0) {
                System.out.println("Twin snowflakes found.");
                return;
            }
        }
        System.out.println("No two snowflakes are alike.");
    }
    private static int compare(int[] mins,int[]curr) {
        for(int x=0;x<6;x++) {
            if(mins[x]>curr[x])return -1;
            if(mins[x]<curr[x])
                return 1;
        }
        return 0;
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
