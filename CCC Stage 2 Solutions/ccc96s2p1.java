import java.util.Scanner;
public class ccc96s2p1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		for (int i=0; i<n; i++) {
			int swaps = 0;
			int l = x.nextInt();
			int[] train = new int[l];
			for (int g=0; g<l; g++) {
				train[g] = x.nextInt();
			}
			int[] bubble = new int[1]; 
			for (int g=0; g<l-1; g++) {
				for (int f=0; f<l-1; f++) {
					if (train[f]>train[f+1]) {
						bubble[0] = train[f];
						train[f] = train[f+1];
						train[f+1] = bubble[0];
						swaps = swaps+1;
					}
				}
			}
			System.out.println("Optimal train swapping takes " +swaps+ " swap(s).");
		}
	}
}
