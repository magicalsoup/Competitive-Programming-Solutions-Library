import java.util.Scanner;
public class wc152j3{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
       int e = scan.nextInt();
       int r = scan.nextInt();
       int [][] ss = new int[s][2];
       int [] stype = new int[s];
       for(int i=0;i<s;i++){
           stype[i] = scan.nextInt();
           ss[i][0] = scan.nextInt();
           ss[i][1] = scan.nextInt();
       }
       int ff =0;
       for(int i=0;i<e;i++){
           int ex = scan.nextInt();
           int ey = scan.nextInt();
           boolean []w= new boolean[4];
           for(int j=0;j<s;j++){
               int dists = (ss[j][0]-ex)*(ss[j][0]-ex)+(ss[j][1]-ey)*(ss[j][1]-ey);
               if(dists<=r*r)
               w[stype[j]-1] = true;
           }
           int n =0;
           for(int j =0;j<4;j++)
               if(w[j])
               n++;
               if(n>=2)
               ff++;
       }
       System.out.println(ff);
     }
}
