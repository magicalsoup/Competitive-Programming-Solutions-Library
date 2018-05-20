import java.util.Scanner;
public class acmtryouts2a{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    scan.nextLine();
  int temp =0;
    int t =0;
    int t1=0;
    int ans= 0;
  while(temp<a){
      String s = scan.nextLine();
      String arr[] = s.split("-");
      int b = Integer.parseInt(arr[0]);
      int c = Integer.parseInt(arr[1]);
      //System.out.println(c);
      if(b>4||b==4&&c>2){
          t = (b-1)*4;
          t1 = t+c;
          ans = 32-t1;
          System.out.println(ans+1);
      }
      else{
    	  if(b==1&&c<=2) {
    		  t = 2-c;
    		  t1 = t+7;
    		  ans = t1;
    		  System.out.println(ans);
    	  }
    	  else if(b==4&&c<=2||b<4) {
    		  t = b*4+c;
    		  t1 = 18-t;
    		  ans = t1+4;
    		  System.out.println(ans+1);
    	  }
      }
      temp++;
  }
  }
}
