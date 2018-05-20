import java.util.*;
public class coci067p1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	sc.nextInt();
	@SuppressWarnings("unchecked")
	Vector<Integer>n[] = new Vector[105];
	for(int i=0;i<n.length;i++)
		n[i] = new Vector<Integer>();
	int e = sc.nextInt();
	int song =0;
	for(int i=0;i<e;i++) {
		int num =sc.nextInt();
		for(int j =0;j<num;j++)
			n[0].add(sc.nextInt());
		if(n[0].contains(1)) {
			for(int j:n[0])
				n[j].add(i);
			song++;
		}
		else {
			for(int j:n[0])
				for(int k:n[0])
					if(j!=k)
						for(int l:n[j])
							if(n[k].contains(l)==false)
								n[k].add(l);
		}
		n[0].clear();
	}
	for(int i=0;i<n.length;i++)
		if(n[i].size()>=song)
			System.out.println(i);
}
}
