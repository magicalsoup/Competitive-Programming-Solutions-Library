package Douwei;
import java.util.*;
public class HowManyThreeDigits {
	public static void main(String[]args) {
int counter =0;
	  for(int i=100;i<=999;i++) {
          int n = i/100;
          int m = (i%100)/10;
          int o = (i%100)%10;
          if(n==1||n==2||n==3||n==4) {
              if(m==1||m==2||m==3||m==4) {
                  if(o==1||o==2||o==3||o==4) {
                      if(n!=m&&m!=o&&n!=o) {
                          counter++;
                      }
                  }
              }
          } 
      }
      System.out.println(counter);
}
}