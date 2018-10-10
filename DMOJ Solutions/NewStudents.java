import java.util.*;
public class NewStudents {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int I = sc.nextInt();
		int numOfStudents = I;
		double average = 0;
		for(int i = 0; i < I; i++)
			average += sc.nextDouble();
		int S = sc.nextInt();
		for(int i = 0; i < S; i++){
			int n = sc.nextInt();
			numOfStudents++;
			average += n;
			System.out.printf("%.3f\n", average / numOfStudents);
		}
		sc.close();
	}
}
