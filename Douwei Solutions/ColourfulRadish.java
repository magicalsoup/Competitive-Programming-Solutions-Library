package Douwei;
import java.util.*;
 public class ColourfulRadish {
 public static void  main(String[] args){
        Scanner input = new Scanner (System.in);
        int x,y,z,w,n,m;
        String weight;
        int repeat= input.nextInt();
 
        for (int i = 0 ; i <repeat; i++){
            x= input.nextInt();
            y=input.nextInt();
            z=input.nextInt();
            w=input.nextInt();
            n=input.nextInt();
            m=input.nextInt();
            input.nextLine();
            int poison = 0;
            int bun=m;
            weight=input.nextLine();
            String [] nums=weight.split(" ");
            int[] numbers = new int[nums.length];
            for (int j= 0; j < nums.length; j++) {
                numbers[j] = Integer.parseInt(nums[j]);
            }
 
            for (int k= 0 ; k <nums.length; k++){
                bun -= poison;
                if (bun<=0){
                    break;
                     
                }
                if (numbers[k]==1){
                    bun= bun+x;
                }
                else if (numbers[k]==2){
                    bun = bun +y;
                }
                else if (numbers[k]==3){
                    bun= bun -z;
                }
                else if (numbers[k]==4){
                    bun= bun-w;
                    poison += n;
                }
 
            }
 
            if (bun>0){
                System.out.println (bun + "g");
 
            }
            else {
                System.out.println ("bye~Rabbit");
            }
        }
    }
  }