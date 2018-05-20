package Douwei;
import java.util.*;
public class TournametSelection {
		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	String arr[] = new String[6];
		for(int i = 0;i<6;i++) {
			arr[i] = scan.nextLine();
		}
		int wincount=0;
		for(int j=0;j<6;j++) {
			if(arr[j].equals("W")) {
				wincount=wincount+1;
			}
			}
		if(wincount==5||wincount==6) {
			System.out.println("1");
			System.exit(0);
			}
		 if(wincount==3||wincount==4) {
		System.out.println("2");
		System.exit(0);
		 }
		 if(wincount==1||wincount==2) {
				System.out.println("3");
				System.exit(0);
			}
		 if(wincount==0) {
		System.out.println("-1");
		System.exit(0);
		}
		}
		}