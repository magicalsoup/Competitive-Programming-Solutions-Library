import java.util.Scanner;
public class mccc19j2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean balanced=true;
        for(int i=0; i<N; i++) {
            int r = sc.nextInt(), p = sc.nextInt();
            if(r != p) balanced=false;
        }
        System.out.println(balanced? "yes": "no");
        sc.close();
    }
}
