import java.util.*;
public class wc99p1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       while(true){
           int n = Integer.parseInt(sc.nextLine());
           if(n==-1)break;
           String str = sc.nextLine();
           int i=0;
           int j = -1;
           int k =0;
           int[][] temp = new int[105][n+5];
           char[] challenge = new char[205];
           char[] challengeb;
           boolean b = false;
           while(true){
               char c = str.charAt(i);
               if(c==')')break;
               i++;
               if(c=='['){
                   j++;
                   k =0;
                   continue;
               }
               if(c==' '||c==']')continue;
               if(c=='('){
                   k =0;
                   b =true;
                   challenge[k] = c;
               }
               else if(b){
                   challenge[k++] = c;
               }
               else{
                   int w =i;
                   while(Character.isDigit(str.charAt(w))&&w++<str.length());
                   temp[j][k++] = Integer.parseInt(str.substring(i-1,w));
                   i = w;
               }
           }
           for(int t= j;t>=0;t--){
               challengeb = challenge.clone(); 
               for(int u =0;u<n;u++)
               challenge[u] = challengeb[temp[t][u]-1];
           }
           System.out.print("(");
           for(int u=0;u<n-1;u++)
           System.out.print(challenge[u]+" ");
           System.out.println(challenge[n-1]+")");
       }
     }
}
