import java.util.Arrays;
import java.util.Scanner;
public class wc164j2{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
         Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int s = scan.nextInt();
        int l = scan.nextInt();
        int [] temps = new int[n];
        for(int i=0;i<n;i++){
            temps[i]=scan.nextInt();
        }
            Arrays.sort(temps);
            int count = 1;
            int index = 0;
            int tc = 1;
            int compare = temps[0];
            while(index<n-1){
                if(tc==1){
                    compare = temps[index];
                }
                if(temps[index+1]-compare<=l){
                    tc++;
                    if(tc==s+1){
                        count++;
                        tc = 1;
                    }
                }
                else{
                    tc=1;
                    count++;
                }
            index++;
            }
        System.out.println(count);
     
}
}
