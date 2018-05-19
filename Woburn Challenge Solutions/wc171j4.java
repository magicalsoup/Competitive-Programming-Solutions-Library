import java.util.Scanner;
public class wc171j4{
 public static void main(String[]args) {
	 @SuppressWarnings("resource")
	 Scanner scan = new Scanner(System.in);
	 String s = scan.nextLine();
	 String arr[] = s.split("");
	 int i1 =0;
	 int j1 =0;
	 boolean yes = true;
	 for(int i=0;i<arr.length-2;i++) { 
				 if(arr[i].equals("o")) {
					 i1 =i;
					 yes = true;
					 break;
				 }
				 else {
					 yes = false;
					 }
	 }
			 
	 if(yes) {
		 for(int j= i1;j<arr.length-1;j++) {
			 if(arr[j].equals("u")) {
				 j1 =j;
				 yes = true;
				 break;
			 }
			 else {
				 yes = false;
			 }
		 }
	 }
			if(yes) {
				for(int k =j1;k<arr.length;k++) {
					if(arr[k].equals("r")) {
						yes = true;
						break;
					}
					else {
						yes = false;
					}
				}
			}
if(yes) {
	System.out.println("Y");
}
else {
	System.out.println("N");
}
 
 }
}
