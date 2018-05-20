package Douwei;
import java.util.*;
public class LinkedListTest {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	sc.nextLine();
	LinkedList<Integer> list= new LinkedList<Integer>();
	for(int i=0;i<a;i++) {
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String str = arr[0];
		if(str.equals("PopFirst")||str.equals("PopLast")) {
		if(str.equals("PopFirst"))
			System.out.println(list.removeFirst());
		if(str.equals("PopLast"))
			System.out.println(list.removeLast());
		}
		else {
			int num = Integer.parseInt(arr[1]);
		if(str.equals("AddFirst"))
			list.addFirst(num);
		if(str.equals("AddLast"))
			list.addLast(num);
	}
	}
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ");
	}
}
}
