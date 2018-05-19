	import java.util.Scanner;
	
	public class dt16l2p3{
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			int a = scan.nextInt();
			scan.nextLine();
			//String arr2[] = new String[a];
			for(int i = 0; i < a; i ++) {
				String t = scan.nextLine();
				String arr[] = t.split("(?!^)");		
			for(int j = 0; j < arr.length; j++) {
			if(arr[j].equals("1")) {
				System.out.print(arr[j]);
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
			}
		}
}
