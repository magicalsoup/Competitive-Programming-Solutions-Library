import java.util.Scanner;
public class coci083p2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String arr[] = s.split("");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("a")) {
				arr[i+1]="";
				arr[i+2]="";
			}
			if(arr[i].equals("i")) {
				arr[i+1]="";
				arr[i+2]="";
			}
			 if(arr[i].equals("e")) {
				arr[i+1]="";
				arr[i+2]="";
			}
			 if(arr[i].equals("i")) {
				arr[i+1]="";
				arr[i+2]="";
			}
			 if(arr[i].equals("o")) {
				arr[i+1]="";
				arr[i+2]="";
			}	
			 if(arr[i].equals("u")) {
				 arr[i+1]="";
				 arr[i+2]="";
			 }
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
