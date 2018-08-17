package Douwei;
import java.util.*;
public class MapExercise {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new HashMap<String,Integer>();
		String one = sc.nextLine();
		String two = sc.nextLine();
		String arr[] = one.split(" ");
		String arr2[] = two.split(" ");
		int count = 1;
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==null) 
				map.put(arr[i], 1);
			else
				map.put(arr[i],(map.get(arr[i]))+1);
		}
		for(int i =0;i<arr2.length;i++) {
			if(map.get(arr2[i])==null)
				System.out.print(0+" ");
			else
				System.out.print(map.get(arr2[i])+" ");
		}
		sc.close();
	}
}
