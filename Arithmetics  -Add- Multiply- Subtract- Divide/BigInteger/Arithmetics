  import java.math.*;
  import java.util.*;
  public class Arithmetics{
      public static void main(String[]args){
          Scanner sc = new Scanner(System.in);
           BigInteger a = sc.nextBigInteger();
           char op = sc.next().charAt(0);
           BigInteger b = sc.nextBigInteger();
           System.out.println(op(a,b));
      sc.close();
      return;
   } 
  public static BigInteger add(BigInteger a, BigInteger b){
      return a.add(b);
    }
  public static BigInteger subtract(BigInteger a,BigInteger b){
      return a.subtract(b);
    }
  public static BigInteger multiply(BigInteger a,BigInteger b){
      return a.multiply(b);
    }
  public static BigInteger divide(BigInteger a,BigInteger b){
      return a.divide(b);
    }
  public static BigInteger op(BigInteger a,BigInteger b,char op){
       if(op=='+')
          return add(a,b);
       if(op=='-')
          return subtract(a,b);
       if(op=='*')
          return multiply(a,b);
       if(op=='/')
          return divide(a,b);
    }
}
