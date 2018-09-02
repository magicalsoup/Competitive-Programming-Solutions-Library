import java.util.*;
public class 	 {
	
    static int[] gradingStudents(int[] grades) {
    	for(int i = 0; i < grades.length; i++) {
    		if(grades[i]>=38&&(5-grades[i]%5)<3)
    			grades[i] = grades[i]+(5-grades[i]%5);    		
    	}
    	return grades;
    }
    
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] grades = new int[n];
		for(int i = 0; i < n; i++) {
			grades[i] = sc.nextInt();
		}
		grades = gradingStudents(grades);
		for(Integer i : grades)
			System.out.println(i);
		sc.close();
	}
}
