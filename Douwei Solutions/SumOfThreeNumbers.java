package Douwei;
import java.util.*;
public class SumOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int[]arr = new int[num];
        Set<Integer> set = new HashSet<Integer>();
        int sum = sc.nextInt();
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }
        for(int i = 0; i < num; i++){
            for(int j = i; j < num; j++){
                if(set.contains((sum-(arr[i] + arr[j])))){
                    count++;
                }
            }
        }
        System.out.println(count/3);
    }
}