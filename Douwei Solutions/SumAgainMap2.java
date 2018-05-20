package Douwei;
import java.util.*;
public class SumAgainMap2 {
    public static boolean contains(int a, int b) {
        String c = Integer.toString(a);
        String d = Integer.toString(b);
        for(int i=0; i<c.length(); i++) {
            if(c.substring(i,i+1).equals(d)) return true;
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        Map <Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            int a = s.nextInt();
            if (map.get(a%(10*m))==null) {
                map.put(a%(10*m), new ArrayList<Integer>());
            }
            map.get(a%(10*m)).add(a);
        }
        for(int i=0; i<m; i++) {
            int q = s.nextInt();
            int t = s.nextInt();
            ArrayList <Integer> list = new ArrayList<>();
            list = map.get(q);
            int ans = 0;
            for(int j=0; j<list.size(); j++) {
                if(contains(list.get(j),t)==true) ans+=list.get(j);
            }
            System.out.println(ans);
        }
    }
}