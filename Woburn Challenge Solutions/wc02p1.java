import java.util.*;
public class wc02p1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        for(int t= sc.nextInt();t>0;t--){
            String s[] =sc.next().split(":");
            int mins = (Integer.parseInt(s[0])-1)*60+Integer.parseInt(s[1]);
            int occ = sc.nextInt();
            if(occ>23){
                System.out.println("Infinite");
                continue;
            }
            int cnt = mins;
            int newmins = mins+1;
            cnt++;
            if(newmins>719)
            newmins -=720;
            int sum = (newmins/60+1)/10+(newmins/60+1)%10+newmins%60/10+newmins%60%10;
            while(sum!=occ){
                newmins++;
                cnt++;
                if(newmins>719)
                newmins -=720;
                    sum = (newmins/60+1)/10+(newmins/60+1)%10+newmins%60/10+newmins%60%10;
            }
            System.out.println(cnt-mins);
        }
     }
}
