package Douwei;
import java.util.*;
public class CrazySearch {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	String t = sc.next();
	LinkedList<String> list = new LinkedList<String>();
	int count =0;
	char arr[] = new char[t.length()];
	for(int i=0;i<t.length();i++) {
		arr[i]  = t.charAt(i);
	}
	int index =0;
	String res = "";
	int lol =0;
	for(int i=0;i<arr.length;i++) {
			res +=arr[i];
			 index ++;
			if(index==a) {
	if(!list.contains(res)) {
		list.add(res);
		count++;
	}
	lol++;
	i = lol-1;
	index =0 ;
	res = "";
	}
	}
System.out.println(count);
}
}/*
import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int n, nc;
            String[] temp = in.readLine().split(" ");
            n = Integer.parseInt(temp[0]);
            nc = Integer.parseInt(temp[1]);
             
            String str = in.readLine();
            int length = str.length()-n;
             
            Set<Integer> set = new HashSet<Integer>();
             
            for(int i = 0; i <= length; i++) {
                int num = 0;
                for(int j = 0; j < n; j++) {
                    num += (str.charAt(i+j)-'a') * Math.pow(nc, j);
                }
                set.add(num);
            }
             
            System.out.println(set.size());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
         
    }
}*/
