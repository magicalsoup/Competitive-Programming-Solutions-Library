import java.util.*;
public class ccc05s2p4{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        main: for(int t = sc.nextInt();t>0;t--){
            int n = sc.nextInt();
            int sum[] = new int[n+1];
            for(int x=1;x<=n;x++){
                int i = sc.nextInt();
                sum[x] = i+sum[x-1];
            }
            for(int x=2;x<=n;x++){
                for(int y=0,z=y+x;z<=n;y++,z++){
                    if(prime(sum[z]-sum[y])){
                        System.out.print("Shortest primed subsequence is length "+x+":");
                        for(int y1=y;y1<z;y1++){
                            System.out.print(" "+(sum[y1+1]-sum[y1]));
                        }
                        System.out.println();
                        continue main;
                    }
                }
            }
            System.out.println("This sequence is anti-primed.");
        }
     }
     public static boolean prime(int n){
         if(n<=1)return false;
         if(n==2)return true;
         if(n%2==0)return false;
         if(n%3==0)return false;
         if(n<9)return true;
         long counter = 5;
         while((counter*counter)<=n){
             if(n%counter==0)return false;
             if(n%(counter+2)==0)return false;
             counter+=6;
         }
         return true;
     }
}
