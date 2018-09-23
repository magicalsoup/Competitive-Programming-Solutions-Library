import java.util.*;
public class Bebiliths {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		Bebilith arr[] = new Bebilith[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new Bebilith(sc.nextInt(), sc.nextInt(), sc.nextInt(), i+1);
		}
		Arrays.sort(arr, new Comparator<Bebilith>(){
			@Override
			public int compare(Bebilith o1, Bebilith o2) {
				if(o1.speed >= s && o2.speed >= s && o1.speed == o2.speed)
					return o2.claw - o1.claw;
				else if(o1.speed < s && o2.speed < s && o1.speed == o2.speed)
					return o2.distance - o1.distance;
				else if(o1.speed != o2.speed)
					return o2.speed - o1.speed;
				return o2.id - o1.id;
			}
		});
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			int a = sc.nextInt()-1;
			System.out.println(arr[a].id);
		}
		sc.close();
	}
	static class Bebilith{
		int speed;
		int distance;
		int claw;
		int id;
		public Bebilith(int speed, int distance, int claw, int id) {
			this.speed = speed;
			this.distance = distance;
			this.claw = claw;
			this.id = id;
		}
	}
}
