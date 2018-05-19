import java.util.Scanner;
public class wc152s1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
        int s[] = new int[10005];
        for(int i=0;i<n;i++){
            s[i] = scan.nextInt();
        }
    for(int i=0;i<n;i++){
        if(s[i]==0){
            for(int j=1;j<=4;j++){
                if((i==0||s[i-1]!=j)&&(i==n-1||s[i+1]!=j)){
                    s[i]= j; break;
                }
            }
        }
    }
     for(int i=0;i<n;i++){
         System.out.print(s[i]);
     }
     System.out.println();
     System.exit(0);
     }
}
