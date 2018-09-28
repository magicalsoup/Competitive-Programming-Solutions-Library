package Douwei;
import java.util.*;
public class CuttingStick{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totpieces = sc.nextInt();
        int totlength = 0;
        int cost = 0;
         
        PriorityQueue<Integer> pieces = new PriorityQueue<Integer>(totpieces);
         
        for(int i=0; i<totpieces; i++){
            int a = sc.nextInt();
            totlength = totlength + a;
            pieces.add(a);
        }
         
        while(pieces.size()!=1){
            int temp = pieces.poll()+pieces.poll();
            cost=cost+temp;
            pieces.add(temp);
        }
         
        System.out.println(cost);
        sc.close();
    }
}
