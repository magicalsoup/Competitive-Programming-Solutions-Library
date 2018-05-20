package Douwei;
import java.util.*;
public class RemoveArray{
	static int[] arr;
	public static void main(String[]args) {
		Scanner sc=  new Scanner(System.in);
		int a =sc.nextInt();
		arr = new int[a];
		int arr2[] = new int[a];
		ArrayList<Integer> add = new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			int v =sc.nextInt();
			arr2[v]++;
			if(arr2[v]<=1)
				add.add(v);
		}
		for(int i=0;i<add.size();i++)
			System.out.print(add.get(i)+" ");
	}
}
/*
 other people's method:
 import java.util.*;
public class Main{
    public static int[] remove(int[] x, int position){
        if(position<x.length-1){
        x=convert(x,position, position+1);
        }
        if(position<x.length-1){
        x=remove(x,position+1);
        }
        return x;
    }
    public static int[] convert(int[] x, int position, int position2){
        if(x[position]==x[position2]){
            x[position2]=-1000;
        }
        if(position2<x.length-1){
        x=convert(x,position, position2+1);
        }
        return x;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        int max=sc.nextInt();
        int[] num= new int[max];
        for(int count=0;count<max;count++){
            num[count]=sc.nextInt();
        }
        int[] last=new int[max];
        last=remove(num, 0);
        for(int count=0;count<max;count++){
            if(last[count]!=-1000){
            System.out.print(last[count]+" ");
            }
        }
         
    }
 
}
 */ 
