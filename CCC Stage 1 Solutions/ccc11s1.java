import java.util.Scanner;
public class ccc11s1{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine();
		int temp=0;
		int french =0;
		int english =0;
		while(temp<a) {
			String s = scan.nextLine();
			String arr[] = s.split("");
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals("s")||arr[i].equals("S")) {
					french++;
				}
				if(arr[i].equals("t")||arr[i].equals("T")) {
					english++;
				}
			}
			temp++;
		}
	if(french>=english) {
		System.out.println("French");
	}
	if(english>french) {
		System.out.println("English");
	}
	}

}
