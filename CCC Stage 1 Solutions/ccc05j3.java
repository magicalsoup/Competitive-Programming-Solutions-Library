import java.util.Scanner; //returning home
public class ccc05j3{
 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 String arr[] = new String[5];
 String arr2[] = new String[5];
 int count = 0;
 for(int i = 0; i < 5; i++) {
  arr[i] = scan.next();
  arr2[i] = scan.next();
  if(arr2[i].equals("SCHOOL")) {
   break;
  } 
  count++;
 }
 for(int i = 0; i <= count; i++) {
  if(arr[i].equals("R")) {
   arr[i] = "LEFT";
  }
  if(arr[i].equals("L")) {
   arr[i] = "RIGHT";
  }
 }
 for(int i = count-1; i >= 0; i--) {
  System.out.println("Turn " + arr[i+1] + " onto " + arr2[i] + " street.");
 }
 System.out.println("Turn " + arr[0] + " into your HOME.");
 }
}