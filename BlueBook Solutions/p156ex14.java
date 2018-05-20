import java.util.Scanner;
public class p156ex14{

     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
 while(true){
     int a = scan.nextInt();
     if(a<0){
         break;
     }
     int b = scan.nextInt();
     int c = scan.nextInt();
     double bill =0;
     int t=0;
     if(b<c){
      t = c-b;
     }
     if(b>c){
         t =(10000-b)+c;
         //System.out.println(t);
     }
    if(t<=10){
        bill = 659;
    }
    if(t>10&&t<30){
        bill = (t-10)*23.73+659;
    }
    if(t>30&&t<=85){
        bill = (t-30)*22.71+(20*23.73)+659;
    }
    if(t>85&&t<=170){
        bill = (t-85)*21.78+(20*23.73)+(55*22.71)+659;
    }
    if(t>170){
        bill = (t-170)*20.85+(85*21.78)+(20*23.73)+(55*22.71)+659;
    }     
    double bill1 = bill/100;
    double finalbill = Math.round(bill1*100.0)/100.0;
    System.out.println("Account #: "+a);
    System.out.println("Bill: "+finalbill);
     }
 
     }
}
