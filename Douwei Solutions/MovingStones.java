package Douwei;
import java.util.*;
public class MovingStones{
     
    public static int avg;
    public static int pile[];
     
    public static int methods(int curnum){
        if(curnum==pile.length/2){
            return 0;
        }
        int returnint=0;
         
        if(pile[curnum]!=avg){
            returnint++;
            int temp = avg-pile[curnum];
            pile[curnum+1]=pile[curnum+1]-temp;
        }
         
        if(pile[pile.length-1-curnum]!=avg){
            returnint++;
            int temp = avg-pile[pile.length-1-curnum];
            pile[pile.length-1-(curnum+1)]=pile[pile.length-1-(curnum+1)]-temp;
        }
         
        return returnint+methods(curnum+1);
         
    }
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilenum = sc.nextInt();
        pile = new int[pilenum];
         
        int sum=0;
        for(int i=0; i<pilenum; i++){
            pile[i]=sc.nextInt();
            sum=sum+pile[i];
        }
         
        avg=sum/pilenum;
         
        System.out.println(methods(0));
    }
}