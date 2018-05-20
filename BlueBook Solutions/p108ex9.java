import java.util.Scanner;
public class p108ex9{
     public static void main(String[]args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int temp =0;
        while(temp<a){
            double pay = scan.nextDouble();
            int hour = scan.nextInt();
            scan.nextLine();
            String tax = scan.nextLine();
            String donate = scan.nextLine();
            String space = scan.nextLine();
            int donate1=10;
            double t =0;
            if(hour<=40){
             t =   pay*hour;
            }
            if(hour>40){
                t = (pay *(hour-(hour-40)))+(((hour-40)*pay)*2);
                //System.out.println(t);
            }
            double s =0;//t*0.1;
            if(tax.equals("B")){
                s = t*0.1;
            }
            if(tax.equals("C")){
                s = t*0.2;
            }
        if(tax.equals("D")){
                s = t*0.29;
            }
          if(tax.equals("E")){
                s = t*0.35;
            }
            if(donate.equals("n")){
                 donate1 = 0;
            }
           // System.out.println(donate1);
            //System.out.println(s);
            double finalmoney = t-s-donate1;
           double finalpay = Math.round(finalmoney*100.0)/100.0;
            System.out.println(String.format("%.2f",finalpay));
            //finalmoney =0;
        temp++;
        }
     }
}
