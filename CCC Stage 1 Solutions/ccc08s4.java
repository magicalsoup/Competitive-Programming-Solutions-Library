import java.util.*;
public class ccc08s4{
    static int[] numbers;
    static int max;
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int k=0;k<n;k++){
            numbers = new int[4];
            max =0;
            for(int i=0;i<4;i++){
                numbers[i] = scan.nextInt();
                
            }
            find(4);
            System.out.println(max);
        }
        
     }
     public static void find(int n){
         if(n==1){
             if(numbers[0]>max&&numbers[0]<=24)
             max = numbers[0];
         }
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 int  a = numbers[i];
                 int b = numbers[j];
                 numbers[j] = numbers[n-1];
                 numbers[i] = a+b;
                 find(n-1);
                
                 numbers[i] = a-b;       
                 find(n-1);
                 numbers[i] = b-a;
                 find(n-1);
                 
                numbers[i] = a*b;
                find(n-1);
                
                if(b!=0&&a%b==0){
                numbers[i] = a/b;
                find(n-1);
                }
                if(a!=0&&b%a==0){
                numbers[i] = b/a;
                find(n-1);
                }
                numbers[i] = a;
                numbers[j] = b;
             }
         }
     }
}