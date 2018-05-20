import java.text.DecimalFormat;
import java.util.*;
public class ccc05s5{
    static double I;
    public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
	I = 0;
	int[] a = new int [100001];

	int n;
	n = sc.nextInt();
	for (int x = 0 ; x < n ; x++)
	    a [x] = sc.nextInt ();
	mergeSort (a, 0, n - 1);
	DecimalFormat df = new DecimalFormat("#.00");
System.out.println(df.format((double)((I+n)/n)));
    }
    public static void mergeSort (int[] a, int x, int z)
    {
	if (x < z)
	{
	    int y = (x + z) / 2;
	    mergeSort (a, x, y);
	    mergeSort (a, y + 1, z);
	    I += merge (a, x, y, z);
	}
    }
    public static double merge (int[] a, int x, int y, int z)
    {
	int[] newa = new int [z - x + 1];
	int xx = x;
	int yy = y + 1;
	int k = 0;
	double total = 0;
	while (xx <= y && yy <= z)
	    if (a [xx] <= a [yy])
		newa [k++] = a [xx++];
	    else
	    {
		newa [k++] = a [yy++];
		total = total + (y + 1 - xx);
	    }
	while (xx <= y)
	    newa [k++] = a [xx++];
	while (yy <= z)
	    newa [k++] = a [yy++];
	for (xx = x ; xx <= z ; xx++)
	    a [xx] = newa [xx - x];
	return total;
    }
}