import java.util.Scanner;
public class p307ex9{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]%100==0&&arr[i]%400==0){
                System.out.println("1");
            }
            else if(arr[i]%100!=0&&arr[i]%4==0||arr[i]==0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
     }
}
