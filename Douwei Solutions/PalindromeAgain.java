package Douwei;
import java.util.*;
import java.io.*;
public class PalindromeAgain{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
        String str = sc.next();
        if(canPermutePalindrome(str))
        System.out.println("YES");
        else
        System.out.println("NO");
        }
}
    public static boolean canPermutePalindrome(String s) {
         
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            if (map.containsKey(ch)){
                int temp = map.get(ch);
                map.put(ch,temp+1);
            }else map.put(ch,1);                                    
        }
         
        boolean isValid = false;
         
        for (char ch : map.keySet()){
            if (map.get(ch)%2==0)
                continue;            
            if ((map.get(ch)%2==1)&&(isValid == true)){
                return false;
            }else if (map.get(ch)%2==1){
                isValid = true;
                continue;
            }
        }
        return true;                        
}
}