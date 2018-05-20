package Douwei;
import java.util.Scanner;
public class DiasterOfCapLock{
    public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
    	for(;;) {
        String sentence = sc.nextLine();
        boolean capitalize = true;
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
             if(c == '.') {
                capitalize = true;
            }
            else if(capitalize && Character.isAlphabetic(c)||c=='i'&&!Character.isAlphabetic(sentence.charAt(i+1))) {
                c = Character.toUpperCase(c);
                capitalize = false;
            }
             System.out.print(c);
        }
        System.out.println();
    	}
    }
}