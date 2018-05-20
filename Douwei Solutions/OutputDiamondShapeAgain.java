package Douwei;
import java.util.Scanner;
public class OutputDiamondShapeAgain
{
    public static void main(String args[]) 
    {
        int n, i, j, space = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        space = n/2;
        for (j = 1; j <= n/2+1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        int count= 0;
        for (j = n/2; j >=0; j--) 
        {
        	count++;
            for (i =1; i <=space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1 ; i <=2*j-1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
     
    }
}