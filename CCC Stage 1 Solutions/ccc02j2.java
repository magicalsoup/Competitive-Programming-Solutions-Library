
import java.util.Scanner;

public class ccc02j2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String arr[] = new String[100000];
		String temps;
		char tempc;
		
		for(int i = 0; i < 100000;i++) {
			arr[i] = scan.nextLine();
			//System.out.println("i= " + i + "value is " + arr[i] + "DEBUG" + arr[i].length());
			if(arr[i].equals("quit!")) {
				//System.out.println("UNICORNS ARE AWESOME!!");
				break;
			}else if(arr[i].length() > 4) {
				//System.out.println("I LIKE TURTLES!");
				temps = arr[i].substring(arr[i].length()-2, arr[i].length()-0);
				//System.out.println(temps);
				if (temps.equals("or")) {
					temps = arr[i].substring(0, arr[i].length()-2);
					tempc = arr[i].charAt(arr[i].length()-3);
					if((tempc != 'a')&&(tempc != 'e')&&(tempc != 'i')&&(tempc != 'o')&&(tempc != 'u')&&(tempc != 'y')) {
					//System.out.println("I LIKE TURTLES");
					System.out.println(temps + "our");
					}
					else {
						System.out.println(arr[i]);
					}
				}
				else {
					System.out.println(arr[i]);
				}
			}else {
				System.out.println(arr[i]);
				//System.out.println("PSY");
			}//end of if
			
		}//end of if
	}//end of for
}//end of main


