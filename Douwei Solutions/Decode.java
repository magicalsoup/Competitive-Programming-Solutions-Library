package Douwei;
import java.util.*;
public class Decode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        ArrayList<Integer> al = new ArrayList<Integer>();
        int[] ans = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            al.add(i);
        }
         
        for(int i=num-1;i>=0;i--){
            int count = 0;
            for(int j=0;j<al.size()-1;j++){
                if(arr[i]>j) count++;
            }
            ans[i] = al.get(count);
            al.remove(count);
        }
        for(int i=0;i<num-1;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println(ans[num-1]);
         
    }
 
}