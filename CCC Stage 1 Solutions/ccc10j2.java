import java.util.Scanner;
public class ccc10j2{
     public static void main(String []args){
       Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      int d = scan.nextInt();
      int s = scan.nextInt();
      int ans = 0;
      int ans2 =0;
      int countf =0;
      int countb= 0;
      for(int i =0;i<s;i++){
          if(i%a==0&&i>=a){
              countb +=b;
          }
          else{
              countf +=1;
          }
          if(countf+countb>=s){
              break;
          }
      }
      ans = countf - countb;
      countf =0;
      countb =0;
       for(int i =0;i<s;i++){
          if(i%c==0&&i>=c){
              countb +=d;
          }
          else{
              countf +=1;
          }
          if(countf+countb>=s){
              break;
          }
      }
      ans2 = countf - countb;
    if(ans2>ans){
        System.out.println("Byron");
    }
    else if(ans>ans2){
        System.out.println("Nikky");
    }
      else{
          System.out.println("Tied");
      }
     }
}