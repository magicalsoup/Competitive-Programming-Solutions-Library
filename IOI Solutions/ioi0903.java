import java.util.*;
import java.io.*;
public class ioi0903{
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
     public static void main(String []args)throws IOException{
        int n = readInt();
        ArrayList<Integer> vases = new ArrayList<Integer>();
        for(int x=1;x<=n;x++)
        vases.add(x);
        Collections.sort(vases, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                StringBuilder b1 = new StringBuilder(" ");
                StringBuilder b2 = new StringBuilder(" ");
                for(int x = (int)Math.pow(2,(int)(Math.log(o1)/Math.log(2))); x >=1;x/=2){
                    if(o1>=x){
                        b1.append("1");
                        o1-= x;
                    }
                    else{
                        b1.append("0");
                    }
                }
                for(int x = (int)Math.pow(2,(int)(Math.log(o2)/Math.log(2))); x >=1;x/=2){
                    if(o2>=x){
                        b2.append("1");
                        o2-= x;
                    }
                    else{
                        b2.append("0");
                    }
                }
                b1.reverse();
                b2.reverse();
                for(int x =0;x<Math.min(b1.length(),b2.length());x++){
                    if(b1.charAt(x)==' '||b2.charAt(x)==' ')
                    break;
                    if(b1.charAt(x)!=b2.charAt(x)){
                        if(b1.charAt(x)=='0')
                        return -1;
                        else if(b1.charAt(x)=='1')
                        return 1;
                    }
                }
                return b1.length()-b2.length();
            }
        });
        for(int i:vases){
            System.out.println(i);
        }
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
