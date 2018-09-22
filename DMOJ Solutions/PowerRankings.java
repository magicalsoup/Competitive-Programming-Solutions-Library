import java.util.*;
public class PowerRankings {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		Student names[] = new Student[n];
		for(int i = 0; i < n; i++)
			names[i] = new Student(sc.next(), 0);
		for(int i = 0; i < p; i++) {
			for(int j = 0; j < n; j++) {
				int t = sc.nextInt();
				names[j] = new Student(names[j].name , names[j].time + t);
			}
		}
		Arrays.sort(names, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.time - o1.time;
			}
		});
		for(int i = 0; i < names.length; i++) {
			System.out.println((i+3) + ". " +names[i].name);
		}
		sc.close();
	}
	static class Student{
		String name;
		int time;
		public Student(String name, int time) {
			this.name = name;
			this.time = time;
		}
		public int getTime() {
			return time;
		}
		public String getName() {
			return name;
		}
		@Override
		public String toString() {
			return "Name = " + getName() + " time = " + getTime();
		}
	}
}
