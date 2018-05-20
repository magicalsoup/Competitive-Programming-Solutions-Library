package Douwei;
import java.io.*;
 import java.util.*;
public class MovingAToTheEnd{
    public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);
    	String s =sc.nextLine();
        char arr[] = s.toCharArray();
        int count2=0;
        for(int i=0;i<s.length();i++) {
        	arr[i] = s.charAt(i);
        	if(arr[i]=='a'||arr[i]=='A')
        		count2++;
        }
        int count =0;
        char arr2[] = new char[count2];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]=='a'||arr[i]=='A') {
        		arr2[count] = arr[i];
        		count++;
        		arr[i] = 0;
        	}
        }
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]!=0) {
        		System.out.print(arr[i]);
        	}
        }
        for(int i=0;i<arr2.length;i++) {
        	System.out.print(arr2[i]);
        }
    }
}