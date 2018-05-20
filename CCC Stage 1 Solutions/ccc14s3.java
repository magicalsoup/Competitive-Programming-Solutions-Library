import java.util.*;
public class ccc14s3 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int count = sc.nextInt();
	int size,car;
	Stack<Integer> mountain=  new Stack<Integer>();
	Stack<Integer>branch = new Stack<Integer>();
	for(int i=0;i<count;i++) {
		size = sc.nextInt();
		for(int j=0;j<size;j++) {
			mountain.push(sc.nextInt());
		}
		car = 1;
		while(car<=size) {
			if(!mountain.isEmpty()&&mountain.peek()==car) {
				mountain.pop();
				car++;
			}
			else if(!branch.isEmpty()&&branch.peek()==car) {
				branch.pop();
				car++;
			}
			else if(!mountain.isEmpty()) {
				branch.push(mountain.peek());
				mountain.pop();
			}
			else {
				System.out.println("N");
				break;
			}
		}
		if(car==size+1) {
			System.out.println("Y");
		}
	}
}
}
