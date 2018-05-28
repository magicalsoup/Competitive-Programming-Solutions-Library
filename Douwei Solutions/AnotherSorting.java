package Douwei;
import java.util.Scanner;
 
public class AnotherSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();
        int[] nums = new int[N];
         
        for (int i = 0; i < N; i++) nums[i] = sc.nextInt();
         
        for (int i = 0; i < N; i++){
            for (int j = i+1; j < N; j++){
                if (i == j) continue;
                 
                boolean swap = false;
                if (nums[i] % 10 > nums[j] % 10){
                    swap = true;
                }
                if (nums[i] % 10 == nums[j] % 10){
                    if (nums[i] < nums[j]){
                        swap = true;
                    }
                }
                 
                if (swap){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
         
        for (int i = 0; i < N; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
