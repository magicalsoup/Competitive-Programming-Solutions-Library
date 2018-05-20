package Douwei;
import java.util.*;
import java.io.*;
public class RemoveItemsFromASet{ 
	static StringTokenizer st;
	static Set<Integer> list = new HashSet<Integer>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException{ 
    	LinkedList<Integer> ans = new LinkedList<Integer>();
          int a = readInt();
          for(int i=0;i<a;i++){
              list.add(readInt());
          }
          int b = readInt();
          for(int i=0;i<b;i++){
              int v = readInt();
              if(list.contains(v))
              list.remove(v);
          }
          br.close();
        for(int i:list)
        	ans.add(i);
     Collections.sort(ans);
     for(int i:ans)
    	 out.print(i+" ");
      out.close();
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
}/*
here is a example, tree set:
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Set<Integer> group = new TreeSet<>();
        Set<Integer> group2 = new HashSet<>();
 
         
        int count1 = s1.nextInt();
        for(int i = 0; i<count1; i++) {
            int n = s1.nextInt();
            group.add(n);
        }
         
        int count2 = s1.nextInt();
        for(int i = 0; i<count2; i++) {
            int n = s1.nextInt();
            if(group.contains(n)) {
                group.remove(n);
            }
        }
         
        for(int q : group) {
            System.out.print(q + " ");
        }
         
    }
}





*/