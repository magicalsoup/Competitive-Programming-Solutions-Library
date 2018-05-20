package Douwei;
import java.util.*;
public class SelectionSort {
    public static void sort(int[]arr){
        int min;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                     
                }
            }
            if(min!=i){
                final int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]sort=new int[n];
        for(int i=0;i<sort.length;i++){
            sort[i]=sc.nextInt();
        }
     sort(sort);
    }
 
}