import java.util.*;
public class TrickOrTreeing {
	static int index, candy;
	static String str;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			candy = 0;
			str = sc.nextLine();
			index = 0;
			Node tree = buildTree();
			System.out.println(min(tree) + " " + candy);
		}
		sc.close();
	}
	static Node buildTree() {
		while(str.charAt(index) == ' ')
			index++;
		if(str.charAt(index) == '(') {
			index++;
			Node left = buildTree();
			Node right = buildTree();
			index++;
			return new Node(left, right);
		}
		else {
			int start = index;
			while(index < str.length() && Character.isDigit(str.charAt(index)))
				index++;
			candy += Integer.parseInt(str.substring(start, index));
			return null;
		}
	}
	static int min(Node node) {
		if(node == null)
			return 0;
		else
			return Math.min(full(node.left) + min(node.right), min(node.left) + full(node.right)) + 3;
	}
	static int full(Node node) {
		if(node == null)
			return 0;
		return full(node.left) + full(node.right) + 4;
	}
	static class Node{
		public Node left;
		public Node right;
		public Node(Node left, Node right) {
			this.left = left;
			this.right = right;
		}
	}
}
