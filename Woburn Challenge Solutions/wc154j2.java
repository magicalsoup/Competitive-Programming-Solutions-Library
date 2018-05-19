import java.util.Scanner;
public class wc154j2{
 public static void main(String[]args) {
	 @SuppressWarnings("resource")
	 Scanner scan = new Scanner(System.in);
	 String s = scan.nextLine();
	 String arr[] = s.split("");
	 int count=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("1")){
				count++;
				 break;
		 }
	 }
		 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("2")){
				count++;
				 break;
		 }
		 }
		 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("3")){
				count++;
				 break;}
		 } for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("4")){
				count++;
				 break;
		 }
		 }
		 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("5")){
				count++;
				 break;
				 }
		 } for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("6")){
				count++;
				 break;}
		 }
		 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("7")){
				count++;
				 break;}
		 }
		 for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("8")){
				count++;
				 break;}
		 } for(int i=0;i<arr.length;i++) {
		 if(arr[i].equals("0")&&arr[i+1].equals("0")&&arr[i+2].equals("9")){
				count++;
				 break;}
		 }
	 
	 
	System.out.println(count);
	 }
}
