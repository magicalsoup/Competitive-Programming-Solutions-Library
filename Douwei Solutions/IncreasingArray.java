package Douwei;
import java.util.*;
public class IncreasingArray{
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
int arr[] = new int[a];
for(int i=0;i<a;i++) {
	arr[i] = sc.nextInt();
	}
if(analyse(arr))
	System.out.println("YES");
else
	System.out.println("NO");
}
public static boolean analyse(int[] sequence) {
    if (sequence.length <= 2) return true;
    int a = sequence[0];
    int b = sequence[1];
    int drops = 0;
    if (a >= b) {
        drops++;
        a = b - 1;
    }

    for (int i = 2; i < sequence.length; i++) {
        int c = sequence[i];
        if (a < b && b < c) {
         
            a = b;
            b = c;
            continue;
        }
     
        drops++;
        if (drops > 1) return false;
      
        if (a < c) {
        
            b = c;
        }
    }
    return true;
}
}
/*
 A very simple way:
 
  import java.util.*;
public class IncreasingArray {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int stay = 0;
        int var;
        int flag = 0;
        for(int rep = 0; rep < len; rep +=1){
            var = sc.nextInt();
            if(var > stay){
                stay = var;
            }
            else{
                flag = 1;
            }
        }
        String out = "YES";
        if(flag != 0){
            out = "NO";
        }
        System.out.println(out);
        sc.close();
    }
 
}*/