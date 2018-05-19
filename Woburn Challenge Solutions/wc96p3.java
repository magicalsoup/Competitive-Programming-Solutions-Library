import java.util.Scanner;
public class wc96p3{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
		String search = "britishcolumbia";
		String search2 = "alberta";
		String search3 = "saskatchewan";
		String search4 = "manitoba";
		String search5 = "ontario";
		String search6 = "quebec";
		String search7 = "novascotia";
		String search8 = "newfoundland";
		String search9 = "newbrunswick";
		String search10 = "pei";

		for(int i = 0; i < 5; i++) {
		String a = scan.nextLine();
		a = a.replace(",", "");
		a = a.replace(".", "");
		a = a.replace(" ", "");
		if (a.toLowerCase().indexOf(search.toLowerCase()) != -1 ) {
			System.out.println("British Columbia");
		}
		else if (a.toLowerCase().indexOf(search2.toLowerCase()) != -1 ) {
			System.out.println("Alberta");
		}
		else if (a.toLowerCase().indexOf(search3.toLowerCase()) != -1 ) {
			System.out.println("Saskatchewan");
		}
		else if (a.toLowerCase().indexOf(search4.toLowerCase()) != -1 ) {
			System.out.println("Manitoba");
		}
		else if (a.toLowerCase().indexOf(search5.toLowerCase()) != -1 ) {
			System.out.println("Ontario");
		}
		else if (a.toLowerCase().indexOf(search6.toLowerCase()) != -1 ) {
			System.out.println("Quebec");
		}
		else if (a.toLowerCase().indexOf(search7.toLowerCase()) != -1 ) {
			System.out.println("Nova Scotia");
		}
		else if (a.toLowerCase().indexOf(search8.toLowerCase()) != -1 ) {
			System.out.println("Newfoundland");
		}
		else if (a.toLowerCase().indexOf(search9.toLowerCase()) != -1 ) {
			System.out.println("New Brunswick");
		}
		else if (a.toLowerCase().indexOf(search10.toLowerCase()) != -1 ) {
			System.out.println("PEI");
		}
		else {
			System.out.println("NO PROVINCE FOUND");
		}
		}
		
	}
}
