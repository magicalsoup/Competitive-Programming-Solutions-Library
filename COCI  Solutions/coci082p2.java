import java.util.*;
public class coci082p2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count =0;
        int [] crossed = new int[n+1];
        for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if(crossed[j]!=1){
                    crossed[j]+=1;
                    count++;
                    if(count==k){
                        System.out.println(j);
                        System.exit(0);
                    }
                }
            }
        }
     }
}
