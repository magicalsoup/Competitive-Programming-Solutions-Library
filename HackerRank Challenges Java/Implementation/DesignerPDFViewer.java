import java.util.*;
public class DesignerPDFViewer {
	
    static int designerPdfViewer(int[] h, String word) {
    	int max = -1;
    	for(int i=0;i<word.length();i++) {
    		max = Math.max(max, h[word.charAt(i)]);
    	}
    	return max*word.length();
    }
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	int h[] = new int[1000];
    	for(int i=0;i<26;i++) 
    		h[i+'a'] = sc.nextInt();
    	String word = sc.next();
    	System.out.println(designerPdfViewer(h,word));
    	sc.close();
    }
}
