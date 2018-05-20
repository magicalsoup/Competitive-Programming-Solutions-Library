package Douwei;
import java.util.*;
public class TheNumber6174Method {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        final int Number=6174;
        int count=1;
         
        while(n!=Number){
            int[] array=new int[4];
             
            for(int i=0;i<4;i++){
                array[i]=n%10;
                n/=10;
            }
             
            Arrays.sort(array);
             
            n=array[3]*999+array[2]*90-array[1]*90-array[0]*999;
             
            count++;
        }
         
        System.out.println(count);
    }
}