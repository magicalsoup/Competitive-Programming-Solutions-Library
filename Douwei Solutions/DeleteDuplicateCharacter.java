package Douwei;
import java.util.*;
public class DeleteDuplicateCharacter{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	LinkedList<Character> list = new LinkedList<Character>();
	for(int i =0;i<str.length();i++) {
	list.add(str.charAt(i));	
	}
	boolean added = false;
	LinkedList<Character> ans = new LinkedList<Character>();
	for(int i=0;i<list.size()-1;i++) {
		if(list.get(i)!=list.get(i+1))
		ans.add(list.get(i));
	}
	ans.add(str.charAt(str.length()-1));
	for(char i:ans)
		System.out.print(i);
}
	}/*
other people's method:
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String prt = "" + str.charAt(0);
            for(int l = 1; l < str.length(); l++){
                if(str.charAt(l) != str.charAt(l-1)){
                    prt = prt + str.charAt(l);
                }
            }
            System.out.println(prt);
    }
}
*/