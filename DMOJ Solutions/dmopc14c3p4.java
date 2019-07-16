import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class dmopc14c3p4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sieve[] = new int[100010];
        precompute(sieve);
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<Integer, ArrayList<Integer>>();
        boolean isSorted[] = new boolean[100010];
        for(int i=1; i<=100000; i++) {
            if(mp.get(sieve[i]) == null)
                mp.put(sieve[i], new ArrayList<Integer>());
            mp.get(sieve[i]).add(i);
        }

        while(T-->0) {
            int K = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
            if(mp.get(K) == null) {
                System.out.println(0);
                continue;
            }
            if(!isSorted[K]) {
                Collections.sort(mp.get(K));
                isSorted[K] = true;
            }
            int l=bsearch(mp.get(K), A, false);
            int r=bsearch(mp.get(K), B, true);
            System.out.println(r - Math.max(0, l) + 1);
        }
        sc.close();
    }
    static int bsearch(ArrayList<Integer> a, int key, boolean lower) {
        int l=0, r=a.size()-1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(lower){
                if(a.get(m) <= key)
                    l = m+1;
                else
                    r = m-1;
            }
            else {
                if(a.get(m) < key)
                    l = m+1;
                else
                    r=m-1;
            }
        }
        return lower? r:l;
    }
    static void precompute(int sieve[]) {
        for(int i=1; i < sieve.length; i++){
            for(int j=i; j< sieve.length; j+=i) {
                sieve[j]++;
            }
        }
    }
}
