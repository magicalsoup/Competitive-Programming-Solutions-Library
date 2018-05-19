import java.util.*;
public class wc16fj2{
    static String map = "abcdefghijklmnopqrstuvwxyz";
    static String word;
    static int n,m;
    public static String shift(int rot){
        String res = "";
        for(int i=0;i<n;i++){
            if(word.charAt(i)=='?'){
                res+= '?';
                continue;
            }
        int orig = map.indexOf(word.charAt(i)+"");
        orig +=rot;
        orig%=26;
        res+= map.charAt(orig);
        }
        return res;
    }
public static boolean cmp(String w, String src){
        for(int i =0;i<n;i++){
            if(src.charAt(i)=='?')
            continue;
            if(w.charAt(i)!=src.charAt(i))
            return false;
        }
        return true;
    }
     public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        word = sc.next();
        String[] rot =new String[26];
        for(int i=0;i<26;i++){
            rot[i] = shift(i);
        }
        int cnt =0;
        HashSet<String> dict = new HashSet<>();
        for(int i=0;i<m;i++){
            String match = sc.next();
            HashSet<String> t = new HashSet<>();
            if(dict.contains(match))
            continue;
            for(int j =1;j<26;j++){
                if(t.contains(rot[j]))
                continue;
                t.add(rot[j]);
                if(cmp(match, rot[j]))
                cnt++;
                }
                dict.add(match);
        }
        sc.close();
        System.out.println(cnt);
     }
}
