package Douwei;
import java.util.*;
public class CanWeFindTheSum2{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int t = sc.nextInt();
  int[]test = new int[a];
  for(int i=0;i<a;i++) {
      test[i] = sc.nextInt();
  }
  for(int i=1;i<=a;i++) {
  if(Sum(test, t,i)) {//Returns true
      System.out.println("yes");
  System.exit(0);
  }
  }
      System.out.println("no");
 
  }
  public static boolean Sum(int[] array, int x,int y) {
      List<Integer> items = new LinkedList<>();
      for (int i : array) { items.add(i); }
      return Sum(items, x, y);
  }
  public static boolean Sum(List<Integer> items,int numRemaining, int count) {
      if (numRemaining == 0) { 
          return true; 
      }
      if (count == 0){ 
          return false; 
      }
      for (int i = 0; i < items.size(); i++) {
          int curr = items.remove(i);
          if (curr <= numRemaining) {
              boolean result = Sum(items, numRemaining - curr, count - 1);
              if (result) {
                  return result;
              }
          }
          items.add(i, curr);
      }
      return false;
  }
}/*
Other people's method:
import java.util.*;
 
public class Main {
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i < n ; i++){
            array[i]=sc.nextInt();
        }
         
        boolean flag=false;
        for(int i=0;i<n;i++){
            flag=flag||(check(target,0,array,0,n));
            if(flag) break;
        }
        if(flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
     
    public static boolean check(int target, int sum, int[] array, int index, int size){
         
        if(index>=size) return false;
         
        sum+=array[index];
        if(sum==target) return true;
         
        boolean flag=false;
        for(int i=1;i<size-index;i++){
            flag=flag||(check(target,sum,array,index+i,size));
            if(flag) break;
        }
        return flag;
    }
}




*/