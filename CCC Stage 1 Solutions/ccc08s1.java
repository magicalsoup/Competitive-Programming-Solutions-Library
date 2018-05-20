import java.util.Scanner;
public class ccc08s1{
     public static void main(String []args){
       Scanner scan = new Scanner(System.in);
       String city = "none";
       int cold = 1000000;
       while(true){
           scan.nextLine();
           String name = scan.next();
           int temp = scan.nextInt();
           if(name.equals("Waterloo")){
               break;
           }
               if(temp<cold){
                   cold = temp;
                   city = name;
               }
           }
       System.out.println(city);
     }
}