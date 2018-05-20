package Douwei;
import java.util.Scanner;

public class NumberSystemsAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = "";
      for(int i=0;i<str.length();i++) {
    	  char c = str.charAt(i);
    	  if(c!='A'&&c!='$'&&c!='='&&c!=39)
    		  if(c=='>'||c=='<')
    			  res+=" ";
    		  else
    		  res+=c;
      }
      String arr[] = res.split(" ");
      int one = Integer.parseInt(arr[0]);
      int two = Integer.parseInt(arr[1]);
      int three = Integer.parseInt(arr[2]);
        String a = Integer.toString(one, two);
        int t= Integer.parseInt(a);
        String b = Integer.toString(t,three);
        System.out.println(b);
       
    }
}