import java.util.Scanner;
public class lpc1j2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String pass = sc.next();
        int len = 0;
        if(!containsDigit(pass)) len++;
        if(!containsLower(pass)) len++;
        if(!containsUpper(pass)) len++;
        if(!containsSpecial(pass)) len++;
        if(pass.length() + len < 6) len += (6 - (pass.length() + len));

        System.out.println(len);

        sc.close();
    }
    static boolean containsDigit(String s) {
        for(int i=0; i<s.length(); i++)
            if(Character.isDigit(s.charAt(i))) return true;
        return false;
    }
    static boolean containsLower(String s) {
        for(int i=0; i<s.length(); i++)
            if(Character.isLowerCase(s.charAt(i))) return true;
        return false;
    }
    static boolean containsUpper(String s){
        for(int i=0; i<s.length(); i++)
            if(Character.isUpperCase(s.charAt(i))) return true;
        return false;
    }
    static boolean containsSpecial(String s) {
        for(int i=0; i<s.length(); i++)
            if(isSpecial(s.charAt(i))) return true;
        return false;
    }
    static boolean isSpecial(char c) {
        return c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || c=='*' || c=='(' || c==')'|| c=='-' || c=='+';
    }
}
