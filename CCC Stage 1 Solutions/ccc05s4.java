import java.util.*;
public class ccc05s4{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       int entries,n,p,max;
       String s[] = new String[1000];
       String hold[] = new String[1000];
       entries = sc.nextInt();
       for(int k=0;k<entries;k++){
           n = sc.nextInt();
           p =0;
           for(int i=0;i<n;i++)
           hold[p++] = sc.next();
           max =0;
           s[0] = hold[p-1];
           p = 0;
           for(int i=0;i<n;i++)
           {
               int look =0;
               while(look<=p&&!hold[i].equals(s[look]))
               look++;
               s[look] = hold[i];
               p = look;
               if(p>=max)
               max = p;
           }
           System.out.println(n*10-2*max*10);
       }
     }
}