package Douwei;
import java.util.Scanner;
public class FindTheMode {
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			int num,bignum =0,amount = -1, total = -1;
			int size[] = new int[10000];
			int modes[] = new int[10000];
			int a = scan.nextInt();
			for(int count =0;count<10000;count++) {
				size[count] =0;
			}
			for(int i =0;i<a;i++) {
				num = scan.nextInt();
				if(num == -1) {
					break;
				}
				size[num]++;
			}
			for(int i =0;i<10000;i++) {
				if(size[i]>bignum)
					bignum = size[i];
			}
			for(int i=0;i<10000;i++) {
				amount++;
				if(size[i]==bignum) {
					total++;
					modes[total]= amount;
				}
			}
		for(int i =0;i<total+1;i++) {
			System.out.println(modes[i]+"   "+bignum);
				}
		}
	}