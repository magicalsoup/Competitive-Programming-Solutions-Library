public class ABC {
public static void main(String[]args) {
	for(int i=0;i<=9;i++) {
		for(int j=0;j<=9;j++) {
			for(int k=0;k<=9;k++) {
				if((i*100+j*10+k)+(j*100+k*10+k)==532) {
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
	}
	
}
}
