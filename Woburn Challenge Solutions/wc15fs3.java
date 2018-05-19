import java.util.*;
public class wc15fs3{
    public static void main(String[]args){
    	@SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n , p,nr,nc,mr,mc, c =0;
    char d;
    nr = nc = mr = mc = 0;
    n = sc.nextInt();
    for(int i=0;i<n;i++){
        d = sc.next().charAt(0);
        p = sc.nextInt();
        if(d=='R'){
            nr++;
            mr = Math.max(mr,p);
        }
        else if(p>1){
            nc++;
            mc = Math.max(mc,p);
        }
        c++;
        System.out.println(c+nr+nc+Math.min(Math.max(mr-nc, 0)+Math.max(mc-nr-1,0),Math.max(mr-nc-1,0)+Math.max(mc-nr,0)));
    }
     }
}
