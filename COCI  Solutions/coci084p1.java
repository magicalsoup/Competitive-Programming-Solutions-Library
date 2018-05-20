import java.util.*;
public class coci084p1{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i] = scan.nextInt();
        }
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i=1;i<5;i++){
                if(a[i-1]>a[i]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                    swap  = true;
                    for(int j=0;j<5;j++){
                        System.out.print(a[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
     }
}
