import java.util.Scanner;
public class ccc13s1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
         int l = scan.nextInt();
        int r = 100000;
        printUnique(l, r);
    }
     static void printUnique(int l, int r)
    {
        
        for (int i=l+1 ; i<=r ; i++)
        {
            int num = i;
            boolean visited[] = new boolean[10];
      
            while (num != 0)
            {
                if (visited[num % 10])
                    break;
      
                visited[num%10] = true;
      
                num = num/10;
            }
            if (num == 0){
                System.out.print(i);
                break;
                //break;
        }
        }
    }
     
}