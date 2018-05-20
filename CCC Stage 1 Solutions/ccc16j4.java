import java.util.Scanner;
public class ccc16j4{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
String time = scan.nextLine();
arrivaltime(time);
	}
	public static void arrivaltime(String time) {
		int h = Integer.parseInt(time.substring(0, 2));
		int min = Integer.parseInt(time.substring(3,5));
		double distance = 0;
		while(distance<120) {
			if(h>=7&&h<10) {
				distance = distance+0.5;
			}
			else if(h>=15&&h<19) {
				distance = distance+0.5;
		}
		else {
			distance++;
		}
		min++;
		if(min==60) {
			min =0;
			h++;
		}
		if(h==24) {
			h =0;
		}
	}
		if(h<10) {
			System.out.print('0');
		}
		System.out.print(h+":");
		if(min<10) {
			System.out.print("0");
		}
		System.out.println(min);
	}
	}
