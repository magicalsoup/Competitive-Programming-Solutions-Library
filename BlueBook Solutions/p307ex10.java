
import java.util.Scanner;
public class p307ex10{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int arr[] = new int[a];
		int arr2[] = new int[a];
		int arr3[] = new int[a];
		int s =0;
		for(int i=0;i<a;i++) {
			arr[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
			arr3[i] = scan.nextInt();
			}
		for(int i=0;i<a;i++) {
			 boolean leap = (( arr[i] % 4 == 0) && (arr[i]) % 100 != 0) || (arr[i] % 400 == 0)||(arr[i] == 0);
		
		if(leap) {
			switch (arr2[i]) {
			case 1:
				 s =0;
				 break;
			case 2:
				s = 31;
				break;
			case 3:
				s = 60;
				break;
			case 4:
				s = 90;
				break;
			case 5:
				s = 121;
				break;
			case 6:
				s = 152;
				break;
			case 7:
				s = 182;
				break;
			case 8:
				s = 213;
				break;
			case 9:
				s = 244;
				break;
			case 10:
				s = 274;
				break;
			case 11:
				s = 305;
				break;
			case 12:
				s = 335;
				break;
			}
		}
			else {
				switch (arr2[i]) {
				case 1:
					 s =0;
					 break;
				case 2:
					s = 31;
					break;
				case 3:
					s = 59;
					break;
				case 4:
					s = 90;
					break;
				case 5:
					s = 120;
					break;
				case 6:
					s = 151;
					break;
				case 7:
					s = 181;
					break;
				case 8:
					s = 212;
					break;
				case 9:
					s = 243;
					break;
				case 10:
					s = 273;
					break;
				case 11:
					s = 304;
					break;
				case 12:
					s = 334;
					break;
				
			}	
			}
		int t = (s+arr3[i]);
		System.out.println(t);
		}
		
	}  
  }
