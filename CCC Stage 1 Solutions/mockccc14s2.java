import java.util.*;
import java.io.*;
public class mockccc14s2{
     public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
           int n = scan.nextInt();
           int dip = 1;
           int pre = scan.nextInt();
           int dir = -1;
           int maxdip =0;
           for(int i=0;i<n-1;i++) {
        	   int next = scan.nextInt();
        	   if((dir==-1&&next<pre)||(dir==0&&next==pre)||(dir==1&&next>pre)) {
        		   dip++;
        	   }
        	   else if(dir==-1&&next==pre&&dip>1)
        	   {
        		   dir =0;
        		   dip++;
        	   }
        	   else if((dir==-1&&next>pre&&dip>1)||(dir==0&&next>pre))
        	   {
        		   dir = 1;
        		   dip++;
        	   }
        	   else if(dir==0&&next<pre) {
        		   dip = 1;
        	   }
        	   else if(dir==1&&dip>=3&&next<=pre)
        	   {
        		   maxdip = Math.max(maxdip, dip);
        		   dir = -1;
        		   if(next<pre)
        			   dip = 2;
        		   else
        			   dip =1;
        	   }
        	   if(i==n-2&&dir==1&&dip>=3)
        		   maxdip = Math.max(maxdip, dip);
        	   pre = next;
           }
           System.out.println(maxdip);
     }
    }