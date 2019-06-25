import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;
public class tc1p3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- >0) {
            String s = sc.next();
            System.out.println(valid(s)? "yes": "no");
        }
        sc.close();
    }
    static boolean valid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(map.keySet().contains(curr)) {
                st.push(curr);
            }
            else if(map.values().contains(curr)) {
                if(!st.empty() && map.get(st.peek()) == curr)
                    st.pop();
                else {
                    return false;
                }
            }
        }
        return st.empty();
    }
}
