import java.util.*;
import java.io.*;
public class ccc98s4{
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[]sa = br.readLine().split(" ");
            LinkedList<String> list = new LinkedList<String>(Arrays.asList(sa));
            for(int j=0;j<list.size();j++){
                if(list.get(j).equals("X")){
                    String n1 = list.get(j-1);
                    String n2 = list.get(j+1);
                    list.remove(j+1);
                    list.set(j,"("+n1+" X "+n2+")");
                    list.remove(j-1);
                    j--;
                }
            }
            for(int j=0;j<list.size();j++){
                if(list.get(j).equals("+")||list.get(j).equals("-"))
                {
                		String symbol = list.get(j);
                		String n1 = list.get(j-1);
                		String n2 = list.get(j+1);
                		list.remove(j+1);
                		list.set(j,"("+n1+" "+symbol+" "+n2+")");
                		list.remove(j-1);
                		j--;
            }
            }
            System.out.println(list.get(0).substring(1,list.get(0).length()-1));
        }
    }
}

    