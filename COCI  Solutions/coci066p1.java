import java.util.*;
public class coci066p1{
public static void main(String[]args){
	@SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int r =0;
   int t =0;
   String x[] = new String[105];
   for(int i=0;i<=n;i++){
       t = 0;
       x[i]  = scan.nextLine();
       for(int j=1;j<i;j++)
       if(x[j].equals(x[i])){
       t++;
       }
       if(i-t-1<t){
       r++;
       }
   }
  System.out.println(r-1);
}
}
