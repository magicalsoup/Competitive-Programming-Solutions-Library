package Douwei;
import java.util.*;
public class PostFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            String b = sc.nextLine();
            String[] c = b.split(" ");
            for (int i = 0; i < c.length; i++) {
                int temp;
                if (c[i].equals("+")) {
                    temp = a.get(a.size() - 1) + a.get(a.size() - 2);
                    a.remove(a.size() - 1);
                    a.remove(a.size() - 1);
                } else if (c[i].equals("-")) {
                    temp = a.get(a.size() - 2) - a.get(a.size() - 1);
                    a.remove(a.size() - 1);
                    a.remove(a.size() - 1);
                } else if (c[i].equals("*")) {
                    temp = a.get(a.size() - 1) * a.get(a.size() - 2);
                    a.remove(a.size() - 1);
                    a.remove(a.size() - 1);
                } else if (c[i].equals("/")) {
                    temp = a.get(a.size() - 2) / a.get(a.size() - 1);
                    a.remove(a.size() - 1);
                    a.remove(a.size() - 1);
                } else {
                    temp = Integer.parseInt(c[i]);
                }
                a.add(temp);
            }
            System.out.println(a.get(0));
        }
    }
 
}