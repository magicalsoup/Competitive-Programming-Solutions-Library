package Douwei;
		import java.util.*;
		public class SimpleStringManipulation {
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
				String a =  sc.nextLine();
			   int f=0;
			   for(int i=0;i<a.length();i++){
			       if(a.charAt(i)!='E'){
			           if(i>0&&a.charAt(i-1)!='E'){
			               f=21;
			           }
			           if(a.charAt(i)=='A'){
			               f++;
			               if(a.charAt(i+1)!='A'||a.charAt(i+2)!='A'){
			                   f=21;
			               }
			               i=i+2;
			           }
			           else if(a.charAt(i)=='B'){
			               f++;
			               if(a.charAt(i+1)!='B'){
			                   f=21;
			               }
			               i++;
			           }
			           else if(a.charAt(i)=='C'){
			               f++;
			               if(a.charAt(i+1)!='C'||a.charAt(i+2)!='C'||a.charAt(i+3)!='C'){
			                   f=21;
			               }
			               i=i+3;
			           }
			       }
			   }
			   if(f==3){
			       System.out.println("YES");
			   }
			   else{
			       System.out.println("NO");
			   }
			}
		}
		