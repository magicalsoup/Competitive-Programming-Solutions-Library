import java.util.Scanner;
public class ccc97s2{

     public static void main(String []args){
   Scanner scan = new Scanner(System.in);
   int a = scan.nextInt();
   int arr[] = new int[a];
   for(int i=0;i<a;i++){
       arr[i] = scan.nextInt();
}
int count =0;
for(int i=0;i<a;i++){
 if(arr[i]%6==0){
     System.out.println(arr[i]+" is nasty");
 }
 else{
     System.out.println(arr[i]+" is not nasty");
 }
    }
     }
}