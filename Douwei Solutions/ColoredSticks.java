package Douwei;
import java.util.HashSet;
import java.util.Scanner;
 
public class ColoredSticks {
 
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String c1 = s.next();
            String c2 = s.next();
            if (set1.contains(c1)) {
                set2.add(c1);
                set1.remove(c1);
            }
            if (set1.contains(c2)) {
                set2.add(c2);
                set1.remove(c2);
            }
        }
        if (set1.size() == 0 || set1.size() == 1)
            System.out.println("Possible");
        else
            System.out.println("Impossible");
        s.close();
    }
 
}
