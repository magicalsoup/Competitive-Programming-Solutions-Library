import java.util.Scanner;

public class hardquestion{

    public static void main(String[] args) {
    	@SuppressWarnings("resource")
      Scanner scan = new Scanner(System.in);
     double g = scan.nextDouble();
     double v = scan.nextDouble();
     double t = scan.nextDouble();
     double t2 = (v*v)+(2*v*g)*t;
    //uble t3 = t2;
    double t3 = Math.sqrt(t2);
     double t1 = (-v+t3)/g;
    // double t5 = t1/g;
     double v2 = t1*g;
     double h =(t1*t1)*g/2;
    double h2 = Math.round(h*1000.0)/1000.0;
    double v3 = Math.round(v2*1000.0)/1000.0;
     System.out.println(h2);
    System.out.println(v3);
    }
}
