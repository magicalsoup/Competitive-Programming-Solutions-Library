import java.util.*;
public class TimeConversion {
    static String timeConversion(String s) {
        String [] tempArray = s.split(":");
        String hours = tempArray[0];
        String minutes = tempArray[1];
        String seconds = tempArray[2].substring(0, 2);
        int tempHours;
        if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
          if (Integer.parseInt(hours) < 12) {
            tempHours = Integer.parseInt(hours);
            tempHours += 12;
            hours = Integer.toString(tempHours);
          }
        }
        if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
          if (Integer.parseInt(hours) == 12) {
            hours = "00";
          }
        }
        return hours+":"+minutes+":"+seconds;
    }
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println(timeConversion(sc.next()));
    	sc.close();
    	}
}
