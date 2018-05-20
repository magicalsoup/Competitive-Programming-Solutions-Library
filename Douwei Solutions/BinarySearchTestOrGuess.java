package Douwei;
import java.util.Scanner;
 
public class BinarySearchTestOrGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        while(low <= high){
            String str = sc.next();
            int mid = (low + high) / 2;
            if(str.equals("high")){
                high = mid - 1;
            }else if(str.equals("low")){
                low = mid + 1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
    }
}