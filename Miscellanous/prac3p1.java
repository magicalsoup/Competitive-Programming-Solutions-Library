import java.util.*;
public class prac3p1{
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	while(true) {
	int n = scan.nextInt();
	if(n==0) {
		break;
	}
	scan.nextLine();
	String[] display  = new String[n];
	for(int i=0;i<n;i++) {
		display[i] = scan.nextLine();
	}
	int[] space	 = new int[n];
	for(int i=1;i<24;i++){
		for(int j=0;j<n;j++) {
			if(display[j].substring(i,i+1).equals(" ")) {
			space[j]++;
		}
	}
	}
	Arrays.sort(space);
	int max = space[0];
	int total =0;
	for(int i=0;i<space.length;i++) {
		total = total+(max-space[i]);
	}
	System.out.println(-total);
}
}
}
