import java.util.*;
public class wc02p7{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int t= sc.nextInt();t>0;t--){
            int head = sc.nextInt();
            int feet = sc.nextInt();
            int eyes = sc.nextInt();
            int tails = sc.nextInt();
            int apes = head-tails;
            head-=apes;
            feet-=2*apes;
            eyes-=2*apes;
            if((2*eyes-feet)%6!=0){
                System.out.println("FUNNY FARM");
                continue;
            }
            int  fish = (2*eyes-feet)/6;
            head-=fish;
            eyes-=3*fish;
            if((feet-2*head)%2!=0){
                System.out.println("FUNNY FARM");
                continue;
            }
            int bison = (feet-2*head)/2;
            int parrot = head-bison;
            if(apes<0||bison<0||parrot<0||fish<0){
                System.out.println("FUNNY FARM");
                continue;
            }
            System.out.println(apes+" "+bison+" "+parrot+" "+fish);
        }
     }
}
