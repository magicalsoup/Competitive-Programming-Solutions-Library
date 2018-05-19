import java.util.Scanner;

public class dt16l2p2{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String arr[] = s.split(" ");
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i].equals("Germany")) {
				arr[i] = "Polska";
			}
			if(arr[i].equals("Czech") && arr[i + 1].equals("Republic")) {
				arr[i] = "Polska";
				arr[i + 1] = "";
			}
			if(arr[i].equals("Slovakia")) {
				arr[i] = "Polska";
			}
			if(arr[i].equals("Ukraine")) {
				arr[i] = "Polska";
			}
			if(arr[i].equals("Belarus")) {
				arr[i] = "Polska";
			}
			if(arr[i].equals("Lithuania")) {
				arr[i] = "Polska";
			}
			if(arr[i].equals("Kaliningrad") && arr[i + 1].equals("Oblast")) {
				arr[i] = "Polska";
				arr[i + 1] = "";
			}
		}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j].equals("")) {
				System.out.print("");
			}
			else {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
