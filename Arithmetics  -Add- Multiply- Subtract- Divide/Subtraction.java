import java.util.*;
public class Subtraction{
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> num1 = new LinkedList<Integer>();
        LinkedList<Integer> num2 = new LinkedList<Integer>();
        LinkedList<Integer> ans = new LinkedList<Integer>();
        LinkedList<Integer> tmp = new LinkedList<Integer>();
        String str1 = scan.next();
        String str2 = scan.next();
        int l1 = str1.length(), l2 = str2.length();
        String s1 = str1, s2 = str2;
        boolean sign = false;
        if (l1 < l2 || (l1 == l2 && str1.compareTo(str2) < 0))
        {
            s1 = str2;
            s2 = str1;
            sign = true;
        }
        l1 = s1.length();
        while (s2.length() != l1)
            s2 = "0" + s2;
        for (int i = l1 - 1; i >= 0; i--)
        {
            num1.add(s1.charAt(i) - '0');
            num2.add('9' - s2.charAt(i));
        }            
        int carry = 0;
        for (int i = 0; i < l1; i++)
        {
            int d1 = 0, d2 = 0;            
                d1 = num1.get(i);            
                d2 = num2.get(i);                      
            int x = d1 + d2 + carry;
            tmp.add(x % 10);
            carry = x / 10;
        }
        for (int i = 0; i < l1; i++)
        {
            int x = tmp.get(i) + carry;
            ans.add(x % 10);
            carry = x / 10;
        }    
        if (s1.equals(s2))
            System.out.print("0\n");
        else
        {
            if (sign)
                System.out.print("-");
            int i;
            for (i = ans.size() - 1; i >= 0; i--)
                if (ans.get(i) != 0)
                    break;
            for (; i >= 0; i--)
                System.out.print(ans.get(i));
            System.out.println();
        }                
    }
}
