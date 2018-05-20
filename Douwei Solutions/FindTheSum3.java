package Douwei;
import java.util.*;
public class FindTheSum3 {
 
    /**
     * @param args the command line arguments
      
            String a = Arrays.toString(partial.toArray());
            a=a.replaceAll(",","");
            a=a.replaceAll("[","");
            a=a.replaceAll("]","");
            System.out.println(a);
     */
    static void sum_up_recursive(ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
        int s = 0;
        for (int x : partial) {
            s += x;
        }
        if (s == target) {
            String a=Arrays.toString(partial.toArray());
            a=a.replaceAll(",","");
            for(int i=1;i<a.length()-1;i++){
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
        if (s >= target) {
            return;
        }
        for (int i = 0; i < numbers.size(); i++) {
            ArrayList<Integer> remaining = new ArrayList<Integer>();
            int n = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                remaining.add(numbers.get(j));
            }
            ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
            partial_rec.add(n);
            sum_up_recursive(remaining, target, partial_rec);
        }
    }
 
    static void sum_up(ArrayList<Integer> numbers, int target) {
        sum_up_recursive(numbers, target, new ArrayList<Integer>());
    }
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int target = s.nextInt();
        ArrayList b=new ArrayList();
        for(int i=0;i<a;i++){
            b.add(s.nextInt());
        }
        Collections.sort(b);
        sum_up(b, target);
    }
}