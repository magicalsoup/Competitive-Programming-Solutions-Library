import java.util.Scanner; 
public class p84ex5{
    public static void main(String[] args) {        
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String strDouble;
        double a = scan.nextDouble();
       
        double b = scan.nextDouble();
        if (a==0&&b==0) {
    		System.out.println("indeterminate");
    	System.exit(0);
    	}
    	if(a==0||b==0) {
    		System.out.println("undefined");
    		System.exit(0);
    	}

        double x;
        if (a + b > 0) {
            x = -b / a;
       
            
            strDouble = String.format("%.2f",x);
			
            System.out.println(strDouble);
        } else if (a + b < 0) {
            x = +b / a;
            strDouble = String.format("%.2f",x);
            System.out.println(strDouble);
        } 
        }
    }
