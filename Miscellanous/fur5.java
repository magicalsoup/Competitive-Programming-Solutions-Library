import java.util.*;
import java.io.*;
public class fur5 {
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
   public static void main(String[] args) throws IOException{
	   @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
       int discs = sc.nextInt();
       solve(discs, "A", "B", "C");
       out.close();
   }
   public static void solve(int n, String start, String auxiliary, String end){
       if (n == 1) {
           out.println(start +""+ end);
       } else {
           solve(n - 1, start, end, auxiliary);
           out.println(start + "" + end);
           solve(n - 1, auxiliary, start, end);
       }
   }
}
