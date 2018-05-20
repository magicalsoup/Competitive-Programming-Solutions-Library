package Douwei;
import java.util.Scanner;
public class SimpleInput{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			double even = 0;
			double odd =0;;
		for(int i=0;i<arr.length;i++) {
			String arr2[] = arr[i].split(":");
			int index = Integer.parseInt(arr2[0]);
			double num = Double.parseDouble(arr2[1]);
			if(index%2==0)
				even+=num;
			else
				odd+=num;
		}
		System.out.println(String.format("%.1f",(odd-even)));
		}
		
	}
        }