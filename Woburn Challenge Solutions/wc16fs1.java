import java.util.*;
public class wc16fs1{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int e = sc.nextInt();
	int b = sc.nextInt();
	List<Integer> list = new ArrayList<>();
	for(int i=0;i<n;i++) {
		int num = sc.nextInt();
		list.add(num);
	}
	if(b>e) {
		System.out.println(e*n);
		return;
	}
	int min = 0;
	Collections.sort(list);
	int save = n-1;
	for(int i = n-1;i>=0;i--) {
		for(int j=save;j>=0;j--) {
			if(list.get(j)<=i) {
				save = j-1;
				min+=b;
				list.remove(j);
				break;
			}
		}
	}
	for(int i=0;i<list.size();i++)
		min+=e;
	System.out.println(min);
}
}
