import java.util.*;
    public class dwitenov02p2
    {
    public static void main(String[] args)
    {
    	@SuppressWarnings("resource")
    	Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    double invalue[] = new double[n];
    for(int i=0;i<n;i++) {
    	invalue[i] = scan.nextDouble();
    }
    double median =0;
    double tot=0;
    double mean=0;
    for(int i=0; i<n; i++)
    {
    tot = tot+invalue[i];
    }
    mean = tot/n;
    int i,j,z;
    double maxCount;
    double modeValue;
    double tmp;
    int[] tally=new int[n];
    for(i=0;i<n;i++)
    {
    for(j=0;j<n-i;j++)
    {
    if(j+1!=n)
    {
    if(invalue[j]>invalue[j+1])
    {
    tmp=invalue[j];
    invalue[j]=invalue[j+1];
    invalue[j+1]=tmp;
    }
    }
    }
    }
    for (i = 0; i < n; i++)
    {
    for(z=i+1;z<n;z++)
    {
    if(invalue[i]==invalue[z])
    {
    tally[i]++;
    }
    }
    }
    maxCount = 0;
    modeValue = 0;
    for (i = 0; i <n; i++)
    {
    if (tally[i] > maxCount)
    {
    maxCount = tally[i];
    modeValue = invalue[i];
    }
    }
    Arrays.sort(invalue);
    if(n%2==0) {
    	median = invalue[n/2]+invalue[n/2-1];
    	median = median/2;
    }
    if(n%2!=0) {
    	median = invalue[n/2];
    }
    System.out.println(String.format("%.2f",mean));
    System.out.println(String.format("%.2f",median));
    System.out.println(String.format("%.2f",modeValue));
    System.out.println(String.format("%.2f",invalue[n-1]));
    System.out.println(String.format("%.2f",invalue[0]));
    }
    }
