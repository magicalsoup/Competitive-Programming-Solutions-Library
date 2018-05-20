package Douwei;
import java.util.Scanner;
public class Encode{
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        System.out.print("0");
        for(int i=1;i<n;i++) {
            int counter=0;
            for(int j=0;j<i;j++) {
                if(arr[i]>arr[j]) {
                    counter++;
                }
            }
            System.out.print(" "+counter);
        }
        }
        }