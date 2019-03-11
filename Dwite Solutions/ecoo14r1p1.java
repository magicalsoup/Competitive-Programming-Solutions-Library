import java.util.*;
public class ecoo14r1p1 {
	static final double RATIO = 0.974699959;
	static final double daySeconds = 3600 * 24;
	static final double hourSeconds = 3600;
	static final double minuteSeconds = 60;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		for(int t = 0; t < 10; t++) {
			int d = sc.nextInt(), h = sc.nextInt(), m = sc.nextInt();
			double earthSeconds = d * daySeconds + h * hourSeconds + m * minuteSeconds;
			double marsSeconds = RATIO * earthSeconds;
			marsSeconds += (36 * minuteSeconds);
				
			marsSeconds = Math.round(marsSeconds);
			
			//System.out.printf("%.6f\n", marsSeconds);
			
			double marsDay = Math.floor(marsSeconds / daySeconds);
			
			marsSeconds %= daySeconds;
			//System.out.printf("%.6f\n", marsSeconds);
			
			double marsHour = Math.floor(marsSeconds / hourSeconds);
			
			//System.out.printf("%.6f\n", marsSeconds);
			
			marsSeconds %= hourSeconds;
			
			
			double marsMinute = Math.round(marsSeconds / minuteSeconds);
			//System.out.printf("%.6f\n", marsSeconds / minuteSeconds);
			
			System.out.printf("Day %s, %s:%s\n", format(marsDay), format(marsHour), format(marsMinute));
			//format(marsMinute);
			
		}
		sc.close();
	}
	static String format(double s) {
		double cur = Double.parseDouble(String.format("%.0f",s));
		//System.out.println(cur);
		int curRes = (int)(cur);
		String res = "";
		if(cur < 10)
			res = "0"+curRes;
		else
			res += curRes;
		return res;
	}
}
