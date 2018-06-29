package Douwei;
import java.util.Scanner;
public class OutputSnakePattern {
     
    static int[][] ar;
     
    static void snake(int x, int y, boolean d , int s){ //true is upright
        if(s == (ar.length * ar.length) + 1){
            return;
        }
        else if(x == ar.length){
            x = ar.length - 1;
            y += 2;
            d ^= true;
        }
        else if(y == ar[0].length){
            y = ar[0].length - 1;
            x += 2;
            d ^= true;
        }
        else if(x < 0){ // out the top
            x = 0;
            d ^= true;
        }
        else if(y < 0){
            y = 0;
            d ^= true;
        }
         
         
        ar[y][x] = s;
        if(d == true){
            snake(x + 1, y - 1, d, s + 1);
        }
        else{
            snake(x - 1, y + 1, d, s + 1);
        }
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
        ar = new int[a][a];
         
        snake(0, 0, true, 1);
         
        for(int y = 0; y < a; y++){
            for(int x = 0; x < a; x++){
                System.out.print(ar[y][x]);
                if(x == a - 1){
                    continue;
                }
                for(int i = 0; i < 4 - (Integer.toString(ar[y][x])).length(); i++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
