package Douwei;
import java.util.*;
public class Equations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int temp = 0;
        int temp2 = 0;
        int count = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = -50; i < 51; i++){
            if(i == 0){
                i = 1;
            }
            else{
                for(int a = -50; a < 51; a++){
                    if(a == 0){
                        a = 1;
                    }
                    else{
                for(int j = -50; j < 51; j++){
                    if(j == 0){
                        j= 1;
                    }
                    else{
                    temp = (int) (num*Math.pow(i, 3) + num2*Math.pow(a, 3) +num3*Math.pow(j, 3)); 
                    if(mp.containsKey(temp)){
                        temp2 = mp.get(temp);
                        mp.remove(temp);
                        mp.put(temp, (temp2+1));                                                
                    }else{
                        mp.put(temp, 1);    
                    }
                }}}
            }
            }
        }
        for(int i = -50; i < 51; i++){
            for(int j = -50; j < 51; j++){
                temp =  (int) (-(num4*Math.pow(i, 3) + num5*Math.pow(j, 3)));
                if(mp.containsKey(temp)){
                    count += mp.get(temp);
                }
            } 
        }
        System.out.println(count);
    }
}
