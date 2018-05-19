	import java.util.Scanner;
	public class ecoo1p1{
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
				for(int scam =0;scam<5;scam++) {
					String s = scan.nextLine();
					String arr[] = s.split("(?!^)");
					for(int i=0;i<arr.length-1;i++) {
						System.out.print(" ");
					}
					System.out.println(arr[0]);
					for(int j=1;j<arr.length;j++) {
						for(int i=arr.length-j;i>1;i--) {
							System.out.print(" ");
						}
						System.out.print(arr[j]);
						for(int i=1;i<j*2;i++) {
							System.out.print(" ");
						}
						System.out.println(arr[j]);
					}
					for(int j=arr.length-2;j>0;j--) {
						for(int i=arr.length-j;i>1;i--) {
							System.out.print(" ");
						}
						System.out.print(arr[j]);
						for(int i=1;i<j*2;i++) {
							System.out.print(" ");
						}
						System.out.println(arr[j]);
					}
					for(int i=0;i<arr.length-1;i++) {
						System.out.print(" ");
					}
					System.out.println(arr[0]);
		}
		}
	}
