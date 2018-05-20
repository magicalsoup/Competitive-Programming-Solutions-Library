package Douwei;
		import java.util.*;
		public class SimpleStack {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			Stack<String> stack = new Stack<String>();
		while(true) {
			String str=  sc.next();
			if(str.equals("END"))
				break;
			
			if(str.equals("push")) {
				String b = sc.next();
				stack.push(b);
			}
			if(str.equals("pop"))
				if(stack.isEmpty())
					System.out.println("EMPTY");
				else {
					stack.pop();
				}
		}
		for(int i= stack.size()-1;i>=0;i--)
			System.out.println(stack.get(i));
			}
		}
		