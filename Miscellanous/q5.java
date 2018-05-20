import java.util.*;
public class q5{
     public static void main(String []args){
    	 @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while(true){
        int a = sc.nextInt();
        if(a==0)
        break;
        String str = sc.next();
        char m[][] = new char[(str.length()/a)][a];
        int count =0;
        for(int i=0;i<(str.length()/a);i++){
            if(i%2!=0){
            for(int j = a-1;j>=0;j--){
                m[i][j] = str.charAt(count);
                count++;
            }
            }
            else{
                for(int j=0;j<a;j++){
                    m[i][j] = str.charAt(count);
                count++;
                    
                }
                
            }
        }
            for(int i=0;i<a;i++){
            for(int j=0;j<(str.length()/a);j++){
            System.out.print(m[j][i]);
            }
            }
            System.out.println();
        }
     }
}
