import java.util.*;
import java.text.DecimalFormat;
public class ecoo12r1p1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.000");
				
		String season = sc.nextLine(); 

		double slugAvg = 0, batAvg = 0;
		Team array[] = new Team[10];
		
		for(int t = 0; t < 10; t++) 
			array[t] = new Team(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(),
					sc.nextDouble(), sc.nextDouble());

		System.out.println(season);
		
		System.out.println("====================");
		
		for(int t = 0; t < 10; t++) {
			double curSlugAvg = array[t].getSlugAvg();
			double curBatAvg = array[t].getBatAvg();
			System.out.println(array[t].name + ": " + df.format(curBatAvg) + " " + df.format(curSlugAvg));
			slugAvg += curSlugAvg; batAvg += curBatAvg;
			
		}
		
		System.out.println("====================");

		batAvg = Math.round(batAvg * 1000.0) / 10000.0; slugAvg = Math.round(slugAvg * 1000.0) / 10000.0;
		
		System.out.println("Big 10 Av: " + df.format(batAvg) + " " + df.format(slugAvg));
		sc.close();
	}
	
	static class Team{
		String name;
		double gamesPlayed, atBats, runs, totalHits, twoBaseHits, threeBasehits, homeRuns;
		public Team(String name, double A, double B, double C, double D, double E, double F, double G) {
			this.name = name;
			this.gamesPlayed = A; 
			this.atBats = B;
			this.runs = C;
			this.totalHits = D;
			this.twoBaseHits = E;
			this.threeBasehits = F;
			this.homeRuns = G;
		}
		public double getSlugAvg() {
			double hits = totalHits - twoBaseHits - threeBasehits - homeRuns;
			return (hits + 2*twoBaseHits + 3*threeBasehits + 4*homeRuns) / atBats;
		}
		public double getBatAvg() {
			return totalHits / atBats;
		}
	}
}
