import java.util.Scanner;
public class acmtryouts3b{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		scan.nextLine();
		String arr1[] = new String[b];
		for(int i=0;i<b;i++) {
			arr1[i]= scan.nextLine();
		}
		for(int j =0;j<b;j++) {
			process_a(arr1[j]);
		}

	}
	
	static void process_a(String a) {
		String arr[] =a.split("");
		for(int i=0;i<arr.length-1;i++) {
			 if(arr[i].equals("<")&&arr[i+1].equals("3")) {
					System.out.print("<3 ");
					}
	}
		for(int j=0;j<1;j++) {
			System.out.print("<3 ");
		}
		System.out.println();
}

}
