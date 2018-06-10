package Douwei;
import java.util.*;
public class PhoneNumbers3{
static ArrayList<String> list=new ArrayList<>();
static String[] dict = {"","","abc", "def", "ghi", "jkl","mno","pqrs","tuv", "wxyz"};
 
public static void dfs(String digit, int index, String cur  ){
    if( index == digit.length() ){
        list.add(cur); return;  
    }
    char ch = digit.charAt(index);
 
    for(int i=0; i<dict[ch-'0'].length(); i++){
        String temp = cur;
        cur += dict[ch-'0'].charAt(i);
        dfs(digit, index+1, cur );
            cur = temp;
        }
}
 
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String digit = sc.next();
    dfs(digit, 0, "");
    Collections.sort(list);
    for(String s : list){ System.out.print(s+" "); }
 
}
}
