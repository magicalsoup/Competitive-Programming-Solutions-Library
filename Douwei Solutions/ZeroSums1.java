package Douwei;
/*import java.util.*;
public class ZeroSums1{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a=  sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]  =sc.nextInt();
        }
        int count =0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(arr[i]+arr[j]==0){
                    count++;
                }
            }
        }
        System.out.println(count/2);
     }
}*/
import java.util.*;
public class ZeroSums1{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> t = new HashSet<Integer>();
        int a  = sc.nextInt();
        int count =0;
        for(int i=0;i<a;i++) {
        	int z = sc.nextInt();
        	t.add(z);
        	if(t.contains(-z))
        		count++;
        }
        System.out.println(count);
     }
}