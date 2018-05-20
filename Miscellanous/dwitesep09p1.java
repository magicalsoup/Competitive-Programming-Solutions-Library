import java.util.*;
public class dwitesep09p1{
    public static void main(String []args){
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
            for(int i=0;i<5;i++){
                int low =scan.nextInt();
                int high = scan.nextInt();
                int count =awesome(low,high);
                System.out.println(count);
            }
     }
     public static boolean sup(int num){
         int sum =0;
         while(num!=0){
             sum+=num%10;
             num/=10;
         }
         if(sum%2==0)
         return true;
         else
         return false;
     }
     public static boolean special(int num){
         int prev = 10;
         boolean dec = true;
         while(num!=0){
             int curr = num%10;
             if(curr>=prev)
             return false;
             prev = curr;
             num/=10;
         }
         return true;
     }
     public static int awesome(int low, int high){
         int count =0;
         boolean pass =true;
         for(;low<=high;low++){
             for(int i =2;i*i <=low;i++){
                 pass = true;
                 if(low%(i*i)==0){
                     pass = false;
                     break;
                 }
             }
             if(pass == true&&sup(low)&&special(low))
             count++;
         }
         return count;
     }
}
