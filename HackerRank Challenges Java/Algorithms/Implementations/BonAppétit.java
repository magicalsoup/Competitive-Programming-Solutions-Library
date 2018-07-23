import java.util.*;
public class BonAppétit {
	
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int sum = 0;
    	for(int i=0;i<bill.size();i++) {
    		if(i!=k)
    			sum+=bill.get(i);
    	}
    	sum/=2;
    	if(b-sum==0)
    		System.out.println("Bon Appetit");
    	else
    		System.out.println(b-sum);
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> bill = new ArrayList<Integer>();
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;i<n;i++)
			bill.add(sc.nextInt());
		int b = sc.nextInt();
		bonAppetit(bill,k,b);
		sc.close();
	}
}