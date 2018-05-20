package Douwei;
import java.util.*;
public class BinaryConversion {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String ans = Integer.toBinaryString(a);
	System.out.println(ans);
}
}/*
The proper way:
import java.util.Scanner;
 
public class Main {
 
    public static void Maina(int n) {
        int num = n;
        int base = 2;
        String value = "";
        while(num>0){
            value =(num%base)+value;
            num = num/base;
        }
        System.out.println(value);
        }
     
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Maina(n);
    }
*/
