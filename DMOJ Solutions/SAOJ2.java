import java.io.*;
import java.util.*;

public class SAOJ2 {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("#include <bits/stdc++.h>");
        System.out.println("using namespace std;");
        System.out.println("int main () {");
        System.out.println("printf(\"%lld\\n\"," + n + "ll*(" + n + "ll+1ll)/2ll);");
        System.out.println("return 0;");
        System.out.println("}");
        sc.close();
    }
}
