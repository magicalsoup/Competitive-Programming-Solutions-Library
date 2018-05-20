import java.util.Scanner;
public class ccc02s1{
     public static void main(String []args){
         Scanner scan = new Scanner(System.in);
        int pink = scan.nextInt();
        int green = scan.nextInt();
        int red = scan.nextInt();
        int orange = scan.nextInt();
        int total = scan.nextInt(); 
        int count =0;
        int min =100000000;
        int total1 = 0;
        for(int  i=0;i<=total;i++) {
        	for( int j=0;j<=total;j++) {
        		for(int  k=0;k<=total;k++) {
        			for( int l =0;l<=total;l++) {
        				if(i*pink+j*green+k*red+l*orange==total) {
        					if(total1<min) {
        					total1 = i+j+k+l;
        					min = total1;
        					}
        					System.out.print("# of PINK is "+i);
        					System.out.print(" # of GREEN is "+j);
        					System.out.print(" # of RED is "+k);
        					System.out.print(" # of ORANGE is "+l);
        					System.out.println();
        					count++;
        				}
        			}
        		}
        	}
            }
        System.out.println("Total combinations is "+count+".");
        System.out.println("Minimum number of tickets to print is "+min+".");
     }
}