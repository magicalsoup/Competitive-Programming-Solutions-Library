import java.util.*;
public class coci072p5{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int [] A = new int[N];
      int [] a = new int[N];
      for(int i=0;i<N;i++){
          A[i] = scan.nextInt();
      }
      for(int i=0;i<3*N;i=i+3){
          a[(i+3)%N] = a[i%N]+A[(i+2)%N]-A[(i+1)%N];
      }
      long sumA = 0;
      for(int i=0;i<N;i++){
          sumA = sumA+A[i];
      }
      long suma =0;
      for(int i=0;i<N;i++){
          suma = suma+ a[i];
      }
      long S = (sumA/3-suma)/N;
      if(N%3!=0){
          for(int i=0;i<N;i++){
              System.out.println(S+a[i]);
          }
      }
      else{
          a[0] = 4;
          a[1] = 0;
          for(int i=0;i<N;i=i+3){
              a[(i+3)%N] = a[i%N]+A[(i+2)%N]-A[(i+1)%N];
          }
          for(int i =1;i<N;i=i+3){
              a[(i+3)%N] = a[i%N]+A[(i+2)%N]-A[(i+1)%N];
          }
          a[2] = A[1]- a[0];
          for(int i =2;i<N;i=i+3){
              a[(i+3)%N] = a[i%N]+A[(i+2)%N]-A[(i+1)%N];
          }
          for(int i=0;i<N;i++){
              System.out.println(a[i]);
          }
      }
     }
}
