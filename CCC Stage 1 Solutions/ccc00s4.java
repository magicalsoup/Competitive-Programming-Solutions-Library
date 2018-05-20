import java.util.Scanner;
public class ccc00s4{
	public static void main (String [] args){
    	Scanner sc = new Scanner(System.in);
	int d = sc.nextInt();
	int c = sc.nextInt();
	int arr[] = new int[c];//c
	int arr2[] = new int[d+1];//d
	arr2[0] = 0;
	for(int i=0;i<c;i++)
		arr[i] = sc.nextInt();
	for(int i=1;i<=d;i++)
	{
		arr2[i] = Integer.MAX_VALUE-1;
		for(int j=0;j<c;j++)
			if(arr[j]<=i)
				arr2[i] = Math.min(arr2[i], (arr2[i-arr[j]]+1));
	}
	if(arr2[d]<Integer.MAX_VALUE-1)
		System.out.println("Roberta wins in "+arr2[d]+" strokes." );
	else
		System.out.println("Roberta acknowledges defeat.");
	}
}

