package Douwei;
import java.util.Scanner;
public class WhatIsTheNthBit{
    public static void isKthBitSet(int n,int k)
    {
        if ((n & (1 << (k-1))) >= 1)
            System.out.print( "1" );
        else
            System.out.print( "0" );
    }
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        isKthBitSet(n , k);
    }
}