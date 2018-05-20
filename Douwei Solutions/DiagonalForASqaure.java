package Douwei;
import java.util.Scanner;
public class DiagonalForASqaure
{
    public static void main(String[] args) 
    {
        int p, q, temp = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        p = n;
        q = n;
            int a[][] = new int[p][q];
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++){
                    a[i][j] = s.nextInt();
                }
            }
            for(int j = 0; j < q; j++)
            {
                temp = a[j][j];
                a[j][j] = a[j][q-1-j];
                a[j][q-1-j] = temp;
            }
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                	if(j!=q-1)
                    System.out.print(a[i][j] + " ");
                	else
                		System.out.print(a[i][j]);
                }
                System.out.println("");
            }
        } 
    }