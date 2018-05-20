import java.util.*;
public class coci072p3{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        LinkedList<String> l = new LinkedList<String>();
        char [][] sr = new char [r][c];
        for(int row =0;row<r;row++){
            String S = scan.next();
            sr[row ] = S.toCharArray();
            String [] a = S.split("#");
            for(int i=0;i<a.length;i++){
                if(a[i].length()>=2){
                    l.add(a[i]);
                }
            }
        }
         for(int col =0;col<c;col++){
            String S = "";
            for(int row =0;row<r;row++){
                S = S+sr[row][col];
            }
            String []a = S.split("#");
            for(int i=0;i<a.length;i++){
                if(a[i].length()>=2){
                    l.add(a[i]);
                }
            }
         }
         Collections.sort(l);
         System.out.println(l.get(0));
     }
}
