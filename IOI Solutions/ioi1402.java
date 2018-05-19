import java.util.*;
public class ioi1402{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int stations[] = new int[n+1];
        int days[] = new int [n+1];
        for(int i=1;i<stations.length;i++){
            stations[i] = sc.nextInt();
            if(i>1)
            days[i] = -1;
        }
        main : for(int x = 1;x<days.length;x++){
            for(int y=Math.min(days.length-1,x+k);y>x;y--){
                if(days[x]!=-1&&stations[y]==1){
                    if(days[y] ==-1){
                        days[y] = days[x]+1;
                        x = y-1;
                        continue main;
                    }
                    else{
                        days[x] = Math.min(days[y],days[x]+1);
                        x = y-1;
                        continue main;
                    }
                }
            }
        }
        System.out.println(days[days.length-1]);
     }
}
