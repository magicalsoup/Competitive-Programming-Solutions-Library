import java.util.*;
public class avatarchange {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int x []= new int[4];
	for(int i=0;i<4;i++) 
		x[i] =sc.nextInt();
	int K = sc.nextInt(),M = sc.nextInt(),B = sc.nextInt(),A = sc.nextInt(),L = sc.nextInt(), O = sc.nextInt();
	int best = 0;
	for(int k=0;k<4;k++)
		for(int m=0;m<4;m++)
			for(int b=0;b<4;b++)
				for(int a=0;a<4;a++)
					for(int l=0;l<4;l++)
						for(int o=0;o<4;o++) {
							int wins =0;
							for(int i=0;i<4;i++) {
								int curr =0;
								if(k==i)curr+=K;
								if(m==i)curr+=M;
								if(b==i)curr+=B;
								if(a==i)curr+=A;
								if(l==i)curr+=L;
								if(o==i)curr+=O;
								if(curr>x[i])wins++;
							}
							if(wins>best)best = wins;
						}
	System.out.println(best);
}
}
