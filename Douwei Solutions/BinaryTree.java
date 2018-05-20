package Douwei;
import java.io.*;
import java.math.*;
public class BinaryTree {
    static BufferedReader br;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger[] arr = new BigInteger[301];
        arr[1] = BigInteger.ONE;
        arr[0] = BigInteger.ONE;
        for(int i=2; i<=300; i++){
            arr[i] = BigInteger.valueOf(0);
            for(int j=0; j<i; j++){
                arr[i] = arr[i].add(arr[j].multiply(arr[i-j-1]));
            }
        }
        String line;
        while((line=br.readLine())!=null){
            int n = Integer.parseInt(line);
            if(n==0) break;
            BigInteger tmp = BigInteger.ONE;
            for(int i=1; i<=n; i++) tmp = tmp.multiply(BigInteger.valueOf(i));
            System.out.println(arr[n].multiply(tmp));
        }
    }
     
}