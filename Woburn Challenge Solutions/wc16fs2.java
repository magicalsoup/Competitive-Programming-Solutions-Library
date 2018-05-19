import java.util.*;
public class wc16fs2{
    static int mod = 10007;
    static int n, ans =0;
    static int f[];
    static int recipes(int m){
        int p = 1;
        for(int i=1;i<n;i++){
            p = p*(f[i]/m%mod)%mod;
        }
        return p;
    }
  public static void main(String[]args){
	  @SuppressWarnings("resource")
Scanner sc=  new Scanner(System.in);
n = sc.nextInt();
f = new int[100];
for(int i=0;i<n;i++){
    f[i] = sc.nextInt();
}
for(int i =1;i*i<=f[0];i++){
    if(f[0]%i==0){
        ans = (ans+recipes(i))%mod;
        if(f[0]/i!=i){
            ans = (ans+recipes(f[0]/i))%mod;
        }
    }
}
      System.out.println(ans);
      
     }
}
