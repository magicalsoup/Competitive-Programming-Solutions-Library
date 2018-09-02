import java.util.*;
public class CompareTheTriplets {

	    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    	List<Integer> List = new ArrayList<Integer>();
	    	int A = 0;
	    	int B = 0;
	    	for(int i=0;i<3;i++) {
	    		if(a.get(i)>b.get(i))
	    			A++;
	    		if(b.get(i)>a.get(i))
	    			B++;
	    	}
	    	List.add(A);
	    	List.add(B);
	    	return List;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Integer> Alice = new ArrayList<Integer>();
	        List<Integer> Bob = new ArrayList<Integer>();
	        List<Integer> Answer = new ArrayList<Integer>();
	        Alice.add(sc.nextInt());
	        Alice.add(sc.nextInt());
	        Alice.add(sc.nextInt());
	        Bob.add(sc.nextInt());
	        Bob.add(sc.nextInt());
	        Bob.add(sc.nextInt());
	        Answer = compareTriplets(Alice,Bob);
	        for(Integer i :Answer)
	        	System.out.print(i+" ");
	        sc.close();
	    }
}
