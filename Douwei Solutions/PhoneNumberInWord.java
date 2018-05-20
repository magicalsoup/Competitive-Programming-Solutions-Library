package Douwei;
import java.util.Arrays;
import java.util.HashMap;
 
public class PhoneNumberInWord {
    public static void main(String[] args){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int dataset = scan.nextInt();
        int datasets[][] = new int[dataset][];
        HashMap[] hash = new HashMap[dataset];
        for(int i = 0; i < dataset; i++){
            int fnum = scan.nextInt();
            hash[i] = new HashMap<String, Integer>();
            datasets[i] = new int[fnum];
            for(int j = 0; j < fnum; j++){
                String str = scan.next();
                String finale = "";
                for(int k = 0; k < str.length(); k++){
                    char ch = str.charAt(k);
                    if(ch == '-') continue;
                    finale += "" + getNum(ch);
                }
                if(hash[i].get(finale) == null) hash[i].put(finale, 1);
                else{
                    int num = (int) hash[i].get(finale);
                    hash[i].remove(finale);
                    hash[i].put(finale, num+1);
                }
                datasets[i][j] = Integer.parseInt(finale);
            }
        }
        for(int i = 0; i < dataset; i++){
            HashMap hah = hash[i];
            Object[] keySet = hah.keySet().toArray();
            Arrays.sort(keySet);
            for(Object str : keySet){
                String st = (String) str;
                int num = (int) hah.get(st);
                if(num > 1){
                    System.out.println(st.charAt(0) + "" + st.charAt(1) + "" + st.charAt(2) + "-" + st.charAt(3) + "" + st.charAt(4) + "" + st.charAt(5) + "" + st.charAt(6) + " " + hah.get(st));
                }
            }
        }
    }
    public static int getNum(char ch){
        if(ch == 'A' || ch == 'B' || ch == 'C'){
            return 2;
        }
        else if(ch == 'D' || ch == 'E' || ch == 'F'){
            return 3;
        }
        else if(ch == 'G' || ch == 'H' || ch == 'I'){
            return 4;
        }
        else if(ch == 'J' || ch == 'K' || ch == 'L'){
            return 5;
        }
        else if(ch == 'M' || ch == 'N' || ch == 'O'){
            return 6;
        }
        else if(ch == 'P' || ch == 'R' || ch == 'S'){
            return 7;
        }
        else if(ch == 'T' || ch == 'U' || ch == 'V'){
            return 8;
        }
        else if(ch == 'W' || ch == 'X' || ch == 'Y'){
            return 9;
        }
        else{
            return Integer.parseInt(ch + "");
        }
    }
}