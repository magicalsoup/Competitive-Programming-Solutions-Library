import java.util.*;
public class dwiteoct07p4 {
	private static final int INFINITY = Integer.MAX_VALUE - 1;
public static void main(String[]args){
	@SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int numBlocks = sc.nextInt();
		int[] minBlocks = new int[height + 1];
		Arrays.fill(minBlocks, INFINITY);
		minBlocks[0] = 0;
		for (int i = 0; i < numBlocks; i++) {
			int blockHeight = sc.nextInt();
			for (int j = height; j >= blockHeight; j--)
				minBlocks[j] = Math.min(minBlocks[j - blockHeight] + 1, minBlocks[j]);
		}
		if (minBlocks[height] != INFINITY)
		System.out.println(minBlocks[height]);
		else
			System.out.println(0);
	}
	}
	
