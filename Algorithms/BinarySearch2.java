import java.util.*;
public class BinarySearch2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(bs(a, 3));
		sc.close();
	}
	static int bs(int a[], int k) {
		int l = 0, r = a.length - 1;
		while(l < r) {
			int m = l + (r - l) / 2;
			if(a[m] == k) return m;
			else if(a[m] >= k) r = m - 1;
			else l = m - 1;
		}
		return -1;
	}
    static int lowerBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value <= array[mid]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    static int upperBound(int[] array, int length, int value) {
        int low = 0;
        int high = length;
        while (low < high) {
            final int mid = (low + high) / 2;
            if (value >= array[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
