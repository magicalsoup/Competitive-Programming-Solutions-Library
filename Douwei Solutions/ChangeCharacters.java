package Douwei;
import java.util.*;
public class ChangeCharacters {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    scan.nextLine();
    String arr[][] = new String[a][a];
    for(int i = 0; i < a; i++) {
        String str = scan.nextLine();
        String blah[] = str.split("(?!^)");
        for(int j = 0; j < a; j++) {
            arr[i][j] = blah[j];
        }
    }
    for(int i = 0; i < b; i++) {
        String s = scan.next();
        if(s.equals("change")) {
            int d = scan.nextInt();
            int e = scan.nextInt();
            String f = scan.next();
            arr[d][e] = f;
        }
        else if(s.equals("reverse")) {
            int d = scan.nextInt();
            reverse(arr, a, d);
        }
        else if(s.equals("changediagonal")) {
            String d = scan.next();
            changediagonal(arr, a, d);
        }
    }
    for(int k = 0; k < a; k++) {
        for(int j = 0; j < a; j++) {
            System.out.print(arr[k][j]);
        }
        System.out.println();
    }
     
 
}
public static String[][] changediagonal(String arr[][], int t, String a){
    int c = t-1;
    for(int i = 0; i < t; i++) {
        for(int j = 0; j < t; j++) {
            if(i == j) {
                arr[i][j] = a;
                arr[i][c] = a;
                c--;
            }
        }
    }
    return arr;
}
public static String[][] reverse(String arr[][], int a, int row){
    String arr2[] = new String[a];
    for(int i = 0; i < a; i++) {
        arr2[i] = arr[row][i];
    }
    int c = a-1;
    for(int i = 0; i < a; i++) {
        arr[row][i] = arr2[c];
        c--;
    }
    return arr;
}
}