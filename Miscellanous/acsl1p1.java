import java.util.*;
public class acsl1p1 {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int in,direct,hour,speed = 0,locate= 0;
	double dis,breaks;
	double east=0,west=0;
	boolean inview = false;
	double total=  0;
	in = sc.nextInt();
	for(int i=0;i<in;i++) {
		dis = 0;
		direct=  sc.nextInt();
		hour = sc.nextInt();
		speed = sc.nextInt();
		dis = (hour*speed);
		locate =0;
		for(int j=0;j<dis;j++) {
			if(!inview)
				locate++;
			if(direct==3)
				east++;
			else if(direct==6)
				west--;
			else if(direct==9)
				east--;
			else if(direct==12)
				west++;
			if(east==0&&west==0) {
				inview = true;
				break;
			}
		}
		if(!inview)
			total+=hour;
		else if(inview) {
			total+=locate/speed;
		break;
		}
	}
	breaks = total/5;
	if(inview)
		if( breaks%1==0)
			System.out.println((int)(breaks-1));
		else
			System.out.println((int)breaks);
	else
		System.out.println(-1);
}
}
