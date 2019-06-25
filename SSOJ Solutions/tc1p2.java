import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class tc1p2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), C = sc.nextInt(), L = sc.nextInt();
        HashSet<String> files = new HashSet<String>();
        ArrayList<Error> errors = new ArrayList<Error>();
        for(int i=0; i<C; i++)
            files.add(sc.next());
        for(int i=0; i<N; i++) {
            Error e = new Error(sc.next(), sc.nextInt(), sc.next());
            if(e.lineNumber % L == 0 && files.contains(e.name))
                errors.add(e);
        }
        for(Error i : errors)
            System.out.println(i.name + " " + i.lineNumber + " " + i.error);
        sc.close();
    }
    static class Error {
        String name, error; int lineNumber;
        public Error(String name, int lineNumber, String error){
            this.name=name;
            this.lineNumber=lineNumber;
            this.error=error;
        }
    }
}
