import java.util.*;
public class wc174j4 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int curi =0 , curj =0 , east =0,west =0,north =0,south =0;
	int r =  sc.nextInt();
	int c = sc.nextInt();
	sc.nextLine();
	char m[][] = new char[r][c];
	String arr[] = new String[r];
	int count =0;
	for(int i=0;i<r;i++) {
		arr[i] = sc.next();
		for(int j=0;j<c;j++) {
			m[i][j]  = arr[i].charAt(count);
			count++;
			if(m[i][j]=='H') {
				curi = i;
				curj = j;
			}
		}
		count =0;
	}
	
	for(int j = curj;j>=0;j--) {
		if(m[curi][j]=='C')
			west++;
	}
	for(int j=curj;j<c;j++) {
		if(m[curi][j]=='C')
			east++;
	}
	for(int i = curi;i>=0;i--) {
		if(m[i][curj]=='C')
			north++;
	}	
	for(int i=curi;i<r;i++) {
		if(m[i][curj]=='C')
			south++;
	}
System.out.println(Math.max(Math.max(east, west), Math.max(south, north)));
}
}
