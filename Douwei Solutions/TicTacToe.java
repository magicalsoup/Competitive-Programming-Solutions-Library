package Douwei;
import java.util.*;
public class TicTacToe {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        boolean tom=false; boolean peter=false;
        int[][]n=new int[3][3];
        for(int a=0; a<3; a++){
            for(int b=0; b<3; b++){
                n[a][b]=sc.nextInt();
            }
        }
        for(int i=0; i<3; i++){
        if(n[i][0]==n[i][1]&&n[i][1]==n[i][2]){
            if(n[i][0]==0){tom=true;}
            else{peter=true;}
        }
        if(n[0][i]==n[1][i]&&n[1][i]==n[2][i]){
            if(n[0][i]==0){tom=true;}
            else{peter=true;}
        }
        }
        if(n[0][0]==n[1][1]&&n[1][1]==n[2][2]){
            if(n[1][1]==0){tom=true;}
            else{peter=true;}
        }
        if(n[2][0]==n[1][1]&&n[1][1]==n[0][2]){
            if(n[1][1]==0){tom=true;}
            else{peter=true;}
        }
        if(tom){System.out.println("Tom wins");}
        else{if(peter){System.out.println("Peter wins");}
        else{System.out.println("Tie");}
        }
    }
}
/*
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] num;
        int sum=0,win=0;
        num=new int[3][3];
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                num[row][col]=sc.nextInt();
            }
        }
        for(int count=0;count<3;count++){
            sum=sum+num[count][count];
        }
        if(sum==0){
            System.out.println("Tom wins");
            win++;
        }
        if(sum==3){
            System.out.println("Peter wins");
            win++;
        }
        for(int row=0;row<3;row++){
            sum=0;
            for(int col=0;col<3;col++){
                sum=sum+num[row][col];
 
            }
            if(sum==0){
                System.out.println("Tom wins");
                win++;
            }
            if(sum==3){
                System.out.println("Peter wins");
                win++;
            }
        }
        for(int col=0;col<3;col++){
            sum=0;
            for(int row=0;row<3;row++){
                sum=sum+num[row][col];
            }
            if(sum==0){
                System.out.println("Tom wins");
                win++;
            }
            if(sum==3){
                System.out.println("Peter wins");
                win++;
            }
        }
        sum=0;
        for(int col=2,row=0;row<3;col--,row++){
                sum=sum+num[row][col];
        }
        if(sum==0){
            System.out.println("Tom wins");
            win++;
        }
        if(sum==3){
            System.out.println("Peter wins");
            win++;
        }
    if(win==0){
        System.out.println("Tie");
    }
    }
}
 */