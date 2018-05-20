import java.util.Scanner;
public class p309ex13{
    public static void main(String[] args) {
    	@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int casenum = sc.nextInt();
        for(int i=0;i<casenum;i++) {
    int t = sc.nextInt();
         String num = sc.next();
    int t2 = sc.nextInt();
        String num2 = sc.next();
    int ans = convertToDecimal(t,num);
    int ans2 = convertToDecimal(t2,num2);
    char op = sc.next().charAt(0);
    int base10 =0;
    if(op=='+')
    base10 = ans+ans2;
    if(op=='-')
    base10 = ans-ans2;
    if(op=='*')
     base10 = ans*ans2;
     if(op=='/')
     base10 = ans/ans2;
    int a = sc.nextInt();
    String finalans = Integer.toString(base10, a);
     System.out.println(finalans);
    }
    }
    	  public static int convertToDecimal(int base, String input) {
    	    int length = input.length();
    	    int sum = 0;
    	    for (int i = 0; i < length; i++) {
    	      int digitValue = calculateDecimalCharacterValue(input.charAt(i), base);
    	      sum += digitValue * Math.pow(base, length - 1 - i);
    	    }

    	    return sum;
    	  }

    	  public static int calculateDecimalCharacterValue(char c, int base) {
    	    if (base < 2) {
    	      throw new IllegalArgumentException();
    	    }

    	    if (base > 36) {
    	      throw new IllegalArgumentException();
    	    }

    	    if (Character.isDigit(c)) {
    	      int numericValue = Character.getNumericValue(c);
    	      if (numericValue < 0) {
    	        throw new IllegalArgumentException();
    	      }
    	      return numericValue;
    	    }

    	    if (Character.isAlphabetic(c) && base > 10) {
    	      int alphabetValue = Character.toUpperCase(c) - 'A' + 10;
    	      if (alphabetValue > base) {
    	        throw new IllegalArgumentException();
    	      }
    	      return alphabetValue;
    	    }

    	    throw new IllegalArgumentException();
    	  }
    	}
