import java.util.*;
public class dwite07c2p4{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<5;i++) {
	  String s = sc.nextLine();
	  if(isValid(s))
		  System.out.println("balanced");
	  else
		  System.out.println("not balanced");
	}

}
public static boolean isValid(String s) {
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < s.length(); i++) {
		char curr = s.charAt(i);
 
		if (map.keySet().contains(curr)) {
			stack.push(curr);
		} else if (map.values().contains(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
			} else {
				return false;
			}
		}
	}
	return stack.empty();
  }
}
