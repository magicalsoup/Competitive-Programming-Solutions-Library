package Douwei;
import java.util.*;
public class Sudoku{ 
static int[][] sMatrix;
static int rSum=0;
static int cSum=0;
static int[] rSumArray=new int[9];
static int[] cSumArray=new int[9];
static int[] boxSumArray=new int[9];
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	sMatrix = new int[9][9];
    	 for(int i=0 ; i<sMatrix.length ; i++){
             for(int j=0 ; j<sMatrix.length ; j++){
             sMatrix[i][j] = sc.nextInt();
             }
             }
        if(checkSudokuStatus(sMatrix))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    public static boolean checkSudokuStatus(int[][] grid) {
        for (int i = 0; i < 9; i++) {

            int[] row = new int[9];
            int[] square = new int[9];
            int[] column = grid[i].clone();

            for (int j = 0; j < 9; j ++) {
                row[j] = grid[j][i];
                square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
            }
            if (!(validate(column) && validate(row) && validate(square)))
                return false;
        }
        return true;
    }

    private static boolean validate(int[] check) {
        int i = 0;
        Arrays.sort(check);
        for (int number : check) {
            if (number != ++i)
                return false;
        }
        return true;
    }
}