package Douwei;
import java.util.*;
 
public class SimplyAFraction{
     
    public static int GCD(int a, int b){
        if(b == 0)  return a;
        else return GCD(b,a%b);
    }
     
     
    public static void main(String[] args)
    {
         
        Scanner sc = new Scanner(System.in);
         
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int L = sc.nextInt();
         
        int a1,b1 = 0;
         
         
        ArrayList<Integer> pairs = new ArrayList<Integer>();
         
        for(int i=1;i<=L;i++)
        {
            for(int j=1;j<=L;j++)
            {
                if(GCD(i,j) == 1)
                {
                     
                    double x = i;
                    double y = j;
                     
                    if( (x/y) >= (a/b) )
                    {
                        pairs.add(i);
                        pairs.add(j);
                    }
                }
            }
        }
         
        double ratio = a/b;
         
        double min = (pairs.get(0) / pairs.get(1)) - ratio;
        a1 = pairs.get(0);
        b1 = pairs.get(1);
         
        for(int i=0;i<pairs.size()-1;i=i+2)
        {
            double diff = (pairs.get(i)/pairs.get(i+1)) - ratio;
             
            if(diff < min)
            {
                min = diff;
                a1 = pairs.get(i);
                b1 = pairs.get(i+1);
            }
        }
         
        System.out.println(a1 + " " + b1);
         
    }
}