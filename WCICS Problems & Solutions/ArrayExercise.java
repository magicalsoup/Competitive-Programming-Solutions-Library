import java.util.*;
public class ArrayExercise {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Name> names = new ArrayList<Name>();
 		while(true) {
			String s = sc.next();
			if(s.equals("END")) break;
			names.add(new Name(s, s.length()));
		}
 		Collections.sort(names);
 		System.out.println(names.size());
 		System.out.println(names.get(0).name);
 		System.out.println(names.get(names.size()-1).name);
		sc.close();
	}
	static class Name implements Comparable<Name>{
		String name; int len;
		public Name(String name, int len) {
			this.name = name;
			this.len = len;
		}
		@Override
		public int compareTo(Name o) {
			return Integer.compare(len, o.len);
		}
	}
}
