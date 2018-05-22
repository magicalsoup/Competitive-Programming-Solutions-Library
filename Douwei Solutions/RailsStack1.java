package Douwei;
import java.util.Scanner;
public class RailsStack1 {
	 static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {        
            int[] stack = new int[1024];
                int n, x, sp, toGo;
                boolean ok;
                for(;;) {
                    n = sc.nextInt();
                    if(n == 0) {
                        break;
                    }
                    for(;;) {
                        x = sc.nextInt();
                        if(x == 0) {
                            break;
                        }
                        ok = true;
                        sp = 0;
                        toGo = 1;
                        for(int i = 1; i < n; i++) {
                            for(; toGo <= x; toGo++) {
                                stack[sp++] = toGo;
                            } 
                            if(sp <= 0 || stack[--sp] != x) {
                                ok = false;
                            }
                            x = sc.nextInt();
                        }
                        if(toGo != x && (sp <= 0 || stack[--sp] != x)) {
                            ok = false;
                        }
                        System.out.print(ok ? "Yes\n" : "No\n");
                    }
                    System.out.println();
                }
            }
        }
