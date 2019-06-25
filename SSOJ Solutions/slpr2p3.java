import java.util.Scanner;
public class slpr2p3 {
    static final String reverseAlpha = new StringBuilder("abcdefghijklmnopqrstuvwxyz").reverse().toString();
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--> 0){
            int N = sc.nextInt();
            char a[] = sc.next().toCharArray();
            for(int i=0; i<N-1; i+=2) {
                char tmp=a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }
            String ret="";
            for(int i=0; i<a.length; i++) {
                int idx = a[i] - 'a';
                ret += reverseAlpha.charAt(idx);
            }
            System.out.println(ret);
        }
        sc.close();
    }
}
