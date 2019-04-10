import java.util.*;
public class PresentFactoryNoises {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		Machine m[] = new Machine[10010];
		
		for(int i = 0; i < m.length; i++)
			m[i] = new Machine("");
		
		for(int i = 0; i < k; i++) {
			int x = sc.nextInt();
			String str = sc.next();
			for(int j = 1; j < m.length; j++) {
				if(j % x == 0)
				m[j].sound += str; 
			}
		}
		
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			if(!m[i].sound.equals(""))
				System.out.println(m[i].sound);
			else
				System.out.println(i);
		}
		sc.close();
	}
	static class Machine{
		String sound = "";
		public Machine(String s) {
			this.sound = s;
		}
		
	}
}
