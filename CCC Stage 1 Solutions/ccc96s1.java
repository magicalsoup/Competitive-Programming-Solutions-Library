import java.util.Scanner;
public class ccc96s1
{

	public static void main(String[] args) {
    int num=0;
    
        Scanner in=new Scanner(System.in); 
     int t = in.nextInt();
     int arr[] = new int[t];
     for(int i =0;i<t;i++) {
    	 arr[i] = in.nextInt();
     }
     
 
    for(int j=0;j<t;j++) {
        int sum=0,dnum=0;
        for(int i=1;i<=arr[j];i++)  
        {
            if(arr[j]%i==0)
              sum+=i;
        }
        dnum=2*arr[j];
        if(sum<dnum)
          System.out.println(arr[j]+" is a deficient number.");
        else if(sum==dnum)  
          System.out.println(arr[j]+" is a perfect number.");
        else if(sum>dnum)
          System.out.println(arr[j]+" is an abundant number.");
    }
    }
}
 