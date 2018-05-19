import java.util.*;
public class wc174j3 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	LinkedList<String> list = new LinkedList<String>();
	list.add("Soul");
	list.add("Mind");
	list.add("Power");
	list.add("Reality");
	list.add("Space");
	list.add("Time");
	int a = sc.nextInt();
	while(a-->0) {
		String b = sc.next();
		if(list.contains(b))
			list.remove(b);
	}
	Collections.sort(list);
	for(String i:list)
		System.out.println(i);
}
}
