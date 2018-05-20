import java.util.*;
public class ccc96s4{
    public static String romanConvert(int N){
        int [] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String convert[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String roman ="";
        for(int i=0;i<values.length;i++){
            while(N>=values[i])
            {
                roman+=convert[i];
                N -= values[i];
            }
        }
        return roman;
    }
    public static int decimalConvert( String phrase){
        int s =0;
        int t =0;
        int old =10000;
        for(int i=0;i<phrase.length();i++){
            char letter  = phrase.charAt(i);
            if(letter == 'I')
            s = 1;
            else if(letter == 'V')
            s = 5;
             else if(letter =='X')
             s = 10;
             else if(letter =='L')
             s  =50;
             else if(letter =='C')
                s = 100;
                else if(letter =='D')
                s = 500;
                else if(letter =='M')
                s = 1000;
                t+=s;
                if(s>old)
                t -=2*old;
                old = s;
            }
            return t;
    }
     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int plus =0;
        scan.nextLine();
        for(int i=0;i<N;i++){
            String line = scan.nextLine();
            plus = line.indexOf("+");
            int A = decimalConvert(line.substring(0,plus));
            int B = decimalConvert(line.substring(plus+1,line.length()-1));
            System.out.print(line);
            if(A+B>1000)
                System.out.println("CONCORDIA CUM VERITATE");
            else
                System.out.println(romanConvert(A+B));
        }
     }
}