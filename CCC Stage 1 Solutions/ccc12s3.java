import java.util.*;
public class ccc12s3{
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int mode[] = new int[1001];
        int mode1[] = new int[1001];
        for(int i=0;i<n;i++){
            int r = scan.nextInt();
            mode[r]++;
            mode1[r]++;
        }
        Arrays.sort(mode);
        int first = mode[mode.length-1];
        int second = mode[mode.length-2];
        if(first==second){
            LinkedList<Integer> l = new LinkedList<Integer>();
            for(int i=1;i<=1000;i++){
                if(mode1[i]==first){
                    l.add(i);
                }
            }
            System.out.println(l.get(l.size()-1)-l.get(0));
        }
        else{
            int l1 =0;
            LinkedList<Integer> l2 = new LinkedList<Integer>();
            for(int i=1;i<=1000;i++){
                if(mode1[i]==first){
                    l1 =i;
                }
                else if(mode1[i]==second){
                    l2.add(i);
                }
            }
            int n1 = Math.abs(l1-l2.get(0));
            int n2 = Math.abs(l1-l2.get(l2.size()-1));
            if(n1>=n2){
                System.out.println(n1);
            }
            else{
                System.out.println(n2);
            }
        }
     }
}