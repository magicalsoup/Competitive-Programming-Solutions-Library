package Douwei;
import java.util.Scanner;
public class NestLoop2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rowCount = 1;
        int num =1;
        for (int i = n; i > 0; i--)
        {
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(num);
            }
            System.out.println();
            rowCount+=2;
            num++;
        }
    }
}