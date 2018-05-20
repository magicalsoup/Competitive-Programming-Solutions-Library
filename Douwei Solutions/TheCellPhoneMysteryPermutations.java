package Douwei;
import java.util.*;
public class TheCellPhoneMysteryPermutations {
    static String[] st = new String[1000000] ;
    static int k=0;
 
static void permute(int[] ary, int at){
    if(at == ary.length){
        String temp="";
        for(int a = 0; a < ary.length; a++){
            temp += ary[a];
        }
        st[k]=temp; k++;
    }
    else{
        for(int move = at; move < ary.length; move++){
            swp(ary, at, move);
            permute(ary, at+1);
            swp(ary, at, move);
        }
    }
}
 
 static void swp(int[]ary, int at, int move){
     int temp;
     temp = ary[at];
     ary[at] = ary[move];
     ary[move] = temp;
 }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int at = 0;
            int length = sc.nextInt();
         
            int[] ary = new int[length];
            for(int rep = 0; rep < length; rep +=1){
                ary[rep] = rep+1;
            }
 
            permute(ary, at);
            Arrays.sort(st, 0, k);
            for(int rep2 = k-1; rep2 >= 0; rep2--){
                System.out.println(st[rep2]);
            }
            st = new String[1000000];
            k=0;
        }
        sc.close();
        }
 
}