import java.util.*;
public class LibraryFine {
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    	int fine = 0;
    	if(y1==y2) {
    		if(m1>m2) 
    			fine = (m1-m2)*500;
    		else if(d1>d2 && m1==m2) 
    			fine = (d1-d2)*15;
    	}
    	else if(y1>y2)
    		fine = 10000;
    	return fine;
    }
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int d1 = sc.nextInt(); int m1 = sc.nextInt(); int y1 = sc.nextInt();
    	int d2 = sc.nextInt(); int m2 = sc.nextInt(); int y2 = sc.nextInt();
    	System.out.println(libraryFine(d1,m1,y1,d2,m2,y2));
    	sc.close();
    }
}
