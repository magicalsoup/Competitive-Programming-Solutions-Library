import java.util.Scanner;
public class wc162j1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       String mate = "None";
       int most = -1;
       for(int i= 0;i<n;i++){
           scan.nextLine();
           String name = scan.next();
           int wins = scan.nextInt();
           int losses = scan.nextInt();
           if(losses==0){
               if(wins>most){
                   most = wins;
                   mate = name;
               }
           }
       }
       System.out.println(mate);
     }
}
