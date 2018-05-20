import java.util.*;
import java.util.Stack;
 public class ccc15s1{  
    public static void main(String args[]){
         Stack<Integer> numbers = new Stack<Integer>();
        int sum =0;
        Scanner scan = new Scanner(System.in);
        int trials = scan.nextInt();
        for(int i=0;i<trials;i++){
            int currentnumber = scan.nextInt();
            if(currentnumber !=0)
                numbers.push(new Integer(currentnumber));
                   else
                             numbers.pop();
                  }
                 
                           while(numbers.empty()==false){
                                 sum = sum+numbers.pop();
                }
                         
                             System.out.println(sum);
                             }
                         }