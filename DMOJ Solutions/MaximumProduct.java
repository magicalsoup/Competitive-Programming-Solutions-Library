import java.util.*;
public class MaximumProduct {
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	ArrayList<Integer> neg = new ArrayList<Integer>();
    	for(int i = 0; i < n; i++) {
    		int x = sc.nextInt();
    		if(x!=0) // only add numbers that are not zero
    			arr.add(x);
    	}
    	if(n != 1) { // if there's more than one number
    		for(int i = 0; i < arr.size(); i++)
    			if(arr.get(i) < 0 ) // if its negative
    				neg.add(arr.get(i));
    			
    		if(neg.size() % 2 != 0) { // if there's a odd number of negatives
    			int max = neg.get(0);
    			for(int i = 0; i < neg.size(); i++)
    				max = Math.max(max, neg.get(i)); // find the biggest negative number
    			arr.remove(Integer.valueOf(max));// remove the biggest negative number so our product will be the biggest,
    											 // Integer.valueOf() is used because we want to remove an object, not an index
    		}
    		int count = 1;
    		for(int i = 0; i < arr.size(); i++)
    			count *= arr.get(i); // multiply to get the max product
    		if(arr.size() == 0)
    			count = 0; // if there's no number left
    		System.out.println(count); 
    	}
    	else
    		System.out.println(arr.get(0)); // print the only number
        sc.close();
    }
}
