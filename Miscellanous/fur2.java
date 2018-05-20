import java.util.*;
public class fur2{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int entries,num,bignum =0,amount = -1, total = -1;
		entries = scan.nextInt();
		int size[] = new int[1001];
		int modes[] = new int[1001];
		for(int count =0;count<1000;count++) {
			size[count] =0;
		}
		for(int i =0;i<entries;i++) {
			num = scan.nextInt();
			size[num]++;
		}
		for(int i =0;i<1000;i++) {
			if(size[i]>bignum)
				bignum = size[i];
		}
		for(int i=0;i<1000;i++) {
			amount++;
			if(size[i]==bignum) {
				total++;
				modes[total]= amount;
			}
		}
		System.out.println(total+1);
	for(int i =0;i<total+1;i++) {
		System.out.println(modes[i]);
	}
	}
}
