package Douwei;
import java.util.*;
	public class FindTheMedianAgain {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int arr[] = new int[a];
			for(int i=0;i<a;i++)
				arr[i] = sc.nextInt();
			int b = sc.nextInt();
			int arr1[] = new int[a+b];
			for(int i=0;i<a;i++)
				arr1[i] = arr[i];
			for(int i=a;i<a+b;i++)
				arr1[i] = sc.nextInt();
			mSort(arr,0,arr1.length);
			double med = 0.0;
			if(arr1.length%2==0) {
				med = (arr1[arr1.length/2]+arr1[arr1.length/2-1]);
				med = (med+0.0)/2;
			}
			else 
				med = arr1[arr1.length/2];
			System.out.println(med);
		}
			public static void merge(int[] num, int le, int leend, int ri, int riend){
		                 int[] temp = new int[ri-le+1];
				 int k=0;
		                 int ind1 = le;
				 int ind2 = ri;
				 while( ind1<=leend && ind2 <= riend ){
					if( num[ind1]<num[ind2] ) {
						temp[k]=num[ind1];
						ind1++;
					}
					else{
		                temp[k]=num[ind2];
						ind2++;
					}
					k++;
				  }

				 while( ind1 <= leend ){ temp[k]=num[ind1]; ind1++; k++;}
				 while( ind2 <= leend ){ temp[k]=num[ind2]; ind2++; k++;}
				 for(int v=0; v<temp.length; v++){
					 num[le+v] = temp[v];
					}
			}
			public static void mSort(int[] num, int le, int ri){
				if( ri >= le ){ return; }
				int mid = (le+ri)/2;
				mSort(num, le, mid );
				mSort(num, mid+1, ri);
				merge(num, le, mid, mid+1,ri);
			}
}
