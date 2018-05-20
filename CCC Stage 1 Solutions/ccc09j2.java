import java.util.Scanner;
public class ccc09j2{
     public static void main(String []args){
         Scanner scan = new Scanner(System.in);
        int trout = scan.nextInt();
        int pike = scan.nextInt();
        int pickerel = scan.nextInt();
        int total = scan.nextInt(); 
        int count =0;
        for(int  i=0;i<=total+1;i++) {
        	for( int j=0;j<=total+1;j++) {
        		for(int k=0;k<=total+1;k++) {
        				if((i*trout)+(j*pike)+(k*pickerel)<=total&&i+j+k>0) {
        					System.out.print(i+" Brown Trout, ");
        					System.out.print(j+" Northern Pike, ");
        					System.out.print(k+" Yellow Pickerel");
        					System.out.println();
        					count++;
        			}
        		}
        	}
            }
        System.out.println("Number of ways to catch fish: "+count);
     }
}