import java.util.*;
public class ccc08s2p5{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        ArrayList<Integer> candy = new ArrayList<Integer>();
        for(int x=0;x<num;x++){
            int k = sc.nextInt();
            int c = sc.nextInt();
            for(int y=0;y<k;y++)
            candy.add(c);
        }
        int dp[][] = new int[2][600];
        for(int x=0;x<candy.size();x++){
            for(int y=0;y<600;y++){
                int a= y+candy.get(x);
                int b=  Math.abs(y-candy.get(x));
                if(x==0)
                dp[x%2][y] = Math.min(a,b);
                else{
                    int preva= a>=600?Integer.MAX_VALUE:dp[(x-1)%2][a];
                    int prevb= dp[(x-1)%2][b];
                    dp[x%2][y] = Math.min(preva,prevb);
                }
            }
        }
        System.out.println(dp[(candy.size()-1)%2][0]);
     }
}
