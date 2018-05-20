package Douwei;
import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double rate = sc.nextDouble();
        double fee = sc.nextDouble();
        if(money*rate == (int) (money*rate)){
            System.out.println((int)(money*rate));
        }
        else{
        System.out.printf("%.2f", (money-fee)*rate);
        }
    }
}
/* using decimal format :
import java.math.RoundingMode;
import java.text.*;
import java.util.*;
public class test6{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	double money = sc.nextDouble();
	double convert = sc.nextDouble();
	double fee = sc.nextDouble();
	double ans1 = money -((fee/100.0)*money);
	double ans2 = ans1*convert;
	ans2 = Math.round(ans2*100.0)/100.0;
	//System.out.println(money);
	System.out.println(format(ans2));
}
 public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }

}

 */
 