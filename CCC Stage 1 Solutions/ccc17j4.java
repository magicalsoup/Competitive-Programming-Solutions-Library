import java.util.*;
public class ccc17j4{
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	int [] clock = {1,2,0,0};
	int min=  sc.nextInt();
	int times =0;
	int halfdays =0;
	if(min>720) {
		halfdays = min/720;
		min = min%720;
		times=  halfdays*31;
	}
	for(int i=0;i<min;i++) {
		clock[3]++;
		if(clock[3]==10) {
			clock[2]++;
			clock[3]=0;
		}
		if(clock[0]==1&&clock[1]==2&&clock[2]==6&&clock[3]==0) {
			clock[0]=0;
			clock[1]=1;
			clock[2] =0;
			clock[3] =0;
		}
		if(clock[1]==9&&clock[2]==6&&clock[3]==0) {
			clock[0]=1;
			clock[1]=0;
			clock[2] = 0;
			clock[3] =0;
		}
		if(clock[2]==6&&clock[3]==0) {
			clock[1]++;
			clock[2]=0;
			clock[3] =0;
		}
		if(clock[0]==0) {
			if(clock[1]-clock[2]==clock[2]-clock[3]) {
				times++;
			}
		}
		else if(clock[0]==1) {
			if(clock[0]-clock[1]==clock[1]-clock[2]&&clock[1]-clock[2]==clock[2]-clock[3]) {
				times++;
			}
		}
	}
	System.out.println(times);
}
}
