import java.util.Scanner;
public class coci091p1{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		int a4 = scan.nextInt();
		int a5 = scan.nextInt();
		int a6 = scan.nextInt();
		int a7 = scan.nextInt();
		int a8 = scan.nextInt();
		
		if(a1 > a2 && a2 > a3 && a3 > a4 && a4 > a5 && a5 > a6 && a6 > a7 && a7 > a8){
			System.out.println("descending");
		}
		else if(a1 < a2 && a2 < a3 && a3 < a4 && a4 < a5 && a5 < a6 && a6 < a7 && a7 <a8){
			System.out.println("ascending");
		}
		else System.out.println("mixed");
	}

}

