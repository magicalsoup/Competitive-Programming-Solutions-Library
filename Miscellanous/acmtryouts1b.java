import java.util.*;
public class acmtryouts1b{
    public static boolean awake( int one, int two, int three, int hour){
        if((hour+three)%(one+two)<one)
        return true;
        return false;
    }
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
   int num = scan.nextInt();
   for(int i=0;i<num;i++){
       int numz = scan.nextInt();
       int [][] n = new int[numz][3];
       int max =1;
       for(int x =0;x<numz;x++){
           n[x][0] = scan.nextInt();
             n[x][1] = scan.nextInt();
               n[x][2] = scan.nextInt();
               max*=(n[x][0]+n[x][1]);
       }
       for(int x=0;x<max;x++){
           boolean t = true;
           for(int y=0;y<numz;y++){
               if(awake(n[y][0], n[y][1], n[y][2],x)){
                   t = false;
                   break;
               }
           }
           if(t){
               System.out.println(x);
               break;
           }
           else
               if(x==max-1)
               System.out.println("Foxen are too powerful");
       }
   }
   scan.close();
     }
}
