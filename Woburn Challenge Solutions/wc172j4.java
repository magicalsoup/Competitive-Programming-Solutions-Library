import java.util.*;
public class wc172j4{
    static String ans = "",prevtoken = "",currtoken= "";
    static char prevchar ='-';
     static boolean is(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return false;
        else
        return true;
    }
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[]  = s.split("-");
        for(int i=0;i<arr.length;i++){
            boolean temp = false;
            for(int j=0;j<arr[i].length();j++){
           if(is(arr[i].charAt(j))&&temp==false){
               temp = true;
           }
           else if(is(arr[i].charAt(j))&&temp){
               arr[i] = arr[i].substring(0,j)+arr[i].substring(j+1);
               j--;
            }
            else{
                temp = false;
            }
        }
        }
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length&&!arr[i].equals(arr[i+1])){
                if(i!=arr.length-1){
                    System.out.print(arr[i]+"-");
                }
            }
            else if(i==arr.length-1){
                System.out.print(arr[i]);
            }
        }
        return;
     }
}
