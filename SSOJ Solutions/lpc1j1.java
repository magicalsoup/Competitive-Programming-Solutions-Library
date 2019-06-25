import java.util.Scanner;
import java.util.ArrayList;
public class lpc1j1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- >0) {
            String s = sc.next();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for(int i=0; i<s.length(); i++) {
                nums.add((int)(s.charAt(i)));
            }
            int prev = nums.get(1)-nums.get(0);
            boolean beautiful=true;
            for(int i=1; i<nums.size()-1; i++) {
                if(nums.get(i+1) - nums.get(i) != prev){
                    beautiful=false;
                    break;
                }
            }
            System.out.println(beautiful? "yes" :"no");

        }
        sc.close();
    }
}
