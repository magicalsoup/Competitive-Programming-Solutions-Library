import java.util.*;
public class wc161s3{
    static class house implements Comparable<house>{
        public final int p;
        public final int c;
        public house(int p,int c){
            this.p = p;
            this.c = c;
        }
        @Override
        public int compareTo(house o){
            return Integer.compare(p,o.p);
        }
    }
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        house[] houses = new house[n];
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            int c = sc.nextInt();
            houses[i] = new house(p,c);
        }
        Arrays.sort(houses);
        int sum =0;
        int max =0;
        PriorityQueue<Integer> best = new PriorityQueue<>();
        for(int i=0;i<houses.length;i++){
            house h = houses[i];
            int p = h.p;
            int c = h.c;
            int timeleft =m-2*p;
            if(timeleft<t)
            break;
            best.add(c);
            sum+=c;
            while(!best.isEmpty()&&t*best.size()>timeleft){
                sum-=best.remove();
            }
            max = Math.max(sum,max);
        }
        System.out.println(max);
     }
}
