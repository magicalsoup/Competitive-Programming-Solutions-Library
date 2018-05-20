import java.util.*;
public class ccc06j4{
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int[][] adj = new int[10][10];
        int [] cnt = new int[10];
        adj[1][7] = 1;
        adj[1][4] = 1;
        adj[2][1] = 1;
        adj[3][4] = 1;
        adj[3][5] = 1;
        cnt[7] = 1;
        cnt[4] = 2;
        cnt[1] = 1;
        cnt[5] = 1;
        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            adj[a][b] = 1;
            cnt[b]++;
            if(a==0||b==0)
            break;
        }
        int index =0;
        int [] order = new int[10];
        for(int i=1;i<=7;i++){
            for(int j=1;j<=7;j++){
                if(cnt[j]==0){
                    order[++index] = j;
                    cnt[j]= -1;
                    for(int k=1;k<=7;k++){
                        if(adj[j][k]==1){
                            adj[j][k] =0;
                            cnt[k]--;
                        }
                    }
                    break;
                }
            }
        }
        if(index<7)
        System.out.println("Cannot complete these tasks. Going to bed.");
     else{
      for(int i =1;i<=7;i++){
          System.out.print(order[i]+" ");
      }   
     }
     }
}