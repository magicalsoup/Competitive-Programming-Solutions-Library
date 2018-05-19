import java.util.Arrays;
import java.util.Scanner;
public class wc172s1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int g = scan.nextInt();
        int leg[] = new int[l];
        int gim[] = new int[g];
        for(int i=0;i<l;i++){
            leg[i] = scan.nextInt();
        }
        for(int i=0;i<g;i++){
            gim[i] = scan.nextInt();
        }
        Arrays.sort(leg);
        Arrays.sort(gim);
        int out =0;
        int templ =0;
        int tempg =0;
        while(out ==0){
            if(gim[tempg]>leg[templ]){
                templ++;
            }
            else if(gim[tempg]==leg[templ]){
                if(tempg == g-1){
                    break;
                }
                else{
                    tempg++;
                }
                templ++;
            }
            else{
                if(tempg == g-1){
                    break;
                }
                else{
                    tempg++;
                }
            }
        if(g - tempg > l-templ){
            out = gim[tempg];
        break;
        }
        }
        if(out ==0){
            System.out.println("-1");
        }
        else{
            System.out.println(out);
        }
     }
}

