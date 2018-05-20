import java.util.Scanner;
public class ecooqual2018p2{
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
			//process arr1[i] and print out
			process_a(arr1[j]);
		}

	}//end of main
	
	static void process_a(String a) {
		//String a = scan.nextLine();
		String arr[] =a.split("");
		boolean int_flag = true;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("E")) {
				System.out.print("Educational ");
			}else if(arr[i].equals("C")) {
				System.out.print("Computing ");
			}else if(arr[i].equals("O")) {
					if (int_flag) {
						System.out.print("Organization of Ontario ");
					}
					
					if (int_flag) {
						int_flag = false;
					}else {
						int_flag = true;
					}
					
			}//end of if
		
		}//end of for
		System.out.println();
	}//end of sub
}//end of class
