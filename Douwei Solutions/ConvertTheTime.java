package Douwei;
import java.util.*;
public class ConvertTheTime {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	long sec = sc.nextLong();
	long weeks = sec/604800;
	long days = (sec%604800)/86400;
	long hours = ((sec%604800)%86400)/3600;
	long minutes = (((sec%604800)%86400)%3600)/60;
	long secs = (((sec%604800)%86400)%3600)%60;
	System.out.print(weeks+ " w "+days+" d "+hours+" h "+minutes+" m "+secs+" s");
}
}
