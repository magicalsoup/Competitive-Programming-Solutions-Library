package Douwei;
import java.util.*;
public class FindPaths{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int node=sc.nextInt();
        int edge=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        ArrayList<ArrayList<Integer>> num=new ArrayList<ArrayList<Integer>>();
        for(int count=0;count<=node;count++){
            num.add(new ArrayList<Integer>());
        }
        for(int count=0;count<edge;count++){
            int next=sc.nextInt();
            int next2=sc.nextInt();
            num.get(next).add(next2);
            num.get(next2).add(next);
        }
        for(int count=0;count<node;count++){
            if(num.get(count).contains(start)&&num.get(count).contains(end)){
                System.out.println(start+" "+count+" "+ end);
            }
        }
         
    }
 
}