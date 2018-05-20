import java.util.Scanner;

public class ccc15j2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			String arr[] = s.split("");
		int happy=0;
		int sad=0;
		for(int i = 0; i < arr.length-3; i++) {
			if(arr[i].equals(":")&&arr[i+1].equals("-")&&arr[i+2].equals(")")) {
				happy++;
			}
		
			else if(arr[i].equals(":")&&arr[i+1].equals("-")&&arr[i+2].equals("(")) {
				sad++;
			}
			}
		if(happy>sad) {
			System.out.println("happy");
		}
			else if(sad>happy) {
				System.out.println("sad");
			}
			else if(sad ==0 && happy ==0) {
			System.out.println("none");
		}
			else {
				System.out.println("unsure");
			}
			}
			}
		
	

