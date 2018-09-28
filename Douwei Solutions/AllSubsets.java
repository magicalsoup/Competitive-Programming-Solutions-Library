package Douwei;
import java.util.*;
public class AllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");
        String[] out = new String[1<<parts.length];
        Arrays.fill(out, "");
        for(int rep = 0; rep < (1<<parts.length); rep +=1){
            int s = rep;
            int flag = 0;
            out[rep] += "{";
            for(int rep2 = 0;rep2 < parts.length; rep2 +=1){
                if((s&1) != 0){
                    if(flag != 0){
                        out[rep] += ",";
                    }
                    out[rep] += parts[rep2];
                    flag +=1;
                }
                s = s>>1;
            }
            out[rep] += "}";
        }
        Arrays.sort(out);
        for(int rep3 = 0; rep3 < (1<<parts.length);rep3 +=1){
            System.out.println(out[rep3]);
        }
        sc.close();
    }
