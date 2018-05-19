import java.util.Scanner;
public class dt16l2p1 {
public static void main (String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	int arr[] = new int [100];
	String temps;
	int temp =0;
	int sum=0;
	for(int j = 0;j<100;j++) {
	temps = scan.nextLine();
		if(temps.equals("No more numbers.")) {
			temp = j;
			break;
		}
		else if(temps.equals("zero")) {
			arr[j] = 0;
		}
		else if(temps.equals("one")) {
			arr[j] = 1;
		}
		else if(temps.equals("two")) {
			arr[j]= 2;
		}
		else  if(temps.equals("three")) {
			arr[j] = 3;
		}
		else if(temps.equals("four")) {
			arr[j] = 4;
		}
		else if(temps.equals("five")) {
			arr[j] = 5;
		}
		else if(temps.equals("six")) {
			arr[j] = 6;
		}
		else if(temps.equals("seven")) {
			arr[j] = 7;
		}
		else if(temps.equals("eight")) {
			arr[j] = 8;
		}
		else  if(temps.equals("nine")) {
			arr[j] = 9;
				}
	
}
	for (int k =0;k<temp;k++) {
		sum = sum+arr[k];	
}
	System.out.print(sum);
}
}
