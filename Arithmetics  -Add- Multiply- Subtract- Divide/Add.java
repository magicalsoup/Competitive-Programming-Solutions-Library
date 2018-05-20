import java.util.*;
public class Add {
	public static void main(String[] args) throws Exception {
		//BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		while (N-- > 0) {
			num a = new num(sc.nextLine());
			num b = new num(sc.nextLine());
			int largest = Math.max(a.getSize(), b.getSize())+1;
			a.setdByte(largest);
			b.setdByte(largest);
			if (!a.isNegative() && !b.isNegative())
				System.out.println(addPositive(a, b, largest));
			else if (a.isNegative() && b.isNegative())
				System.out.println("-" + addPositive(a, b, largest));
			else if (a.isNegative() && !b.isNegative())
				System.out.println(addNeg(b, a, largest));
			else
				System.out.println(addNeg(a, b, largest));
		}
	}
	static String addPositive(num a, num b, int largest) {
		byte[] numbers = new byte[largest]; // +1
		int carry = 0;
		StringBuilder output = new StringBuilder();
		int leading = 0;
		for (int index = largest - 1; index >= 0; index--) {
			numbers[index] = (byte) (carry + a.getByte(index) + b.getByte(index));
			if (numbers[index] >= 10) {
				numbers[index] -= 10;
				carry = 1;
			} else
				carry = 0;
			output.append(numbers[index]);
			if (numbers[index] != 0)
				leading = index;
		}
		return output.reverse().substring(leading);
	}

	static String addNeg(num a, num b, int largest) {
		int com = compare(a, b, largest);
		boolean swap = false;
		if (com == -1) {
			swap = true;
			num temp = a;
			a = b;
			b = temp;
		} else if (com == 0)
			return "0";
		int carry = 0;
		StringBuilder output = new StringBuilder();
		int leading = 0;
		byte[] numbers = new byte[largest]; // +1
		for (int index = numbers.length - 1; index >= 0; index--) {
			numbers[index] = (byte) (a.getByte(index) - b.getByte(index) - carry);
			if (numbers[index] < 0) {
				carry = 1;
				numbers[index] += 10;
			} else 
				carry = 0;
			output.append(numbers[index]);
			if (numbers[index] != 0)
				leading = index;
		}
		if (carry == -1 || swap)
			return "-" + output.reverse().substring(leading);
		return output.reverse().substring(leading);

	}

	static int compare(num a, num b, int largest) {
		if (a.getSize() > b.getSize())
			return 1;
		if (a.getSize() < b.getSize())
			return -1;
		for (int i = largest - a.getSize(); i < largest; i++) 
			if (a.getByte(i)> b.getByte(i))
				return 1;
			else if (a.getByte(i) < b.getByte(i))
				return -1;
		
		return 0;
	}
}

class num {
	String dString;
	byte[] dByte;
	int size;
	boolean negative;

	public num(String s) {
		if (s.startsWith("-")) {
			this.dString = s.substring(1);
			this.negative = true;
		} else
			this.dString = s;
		this.size = this.dString.length();
	}

	public void setdByte(byte[] num) {
		this.dByte = num;
	}

	public String getdString() {
		return dString;
	}

	public void setdByte(int k) {
		int index = 0;
		dByte = new byte[k];
		for (int i = k - size; i < k; i++) {
			dByte[i] = (byte) Character.getNumericValue(dString.charAt(index));
			index++;
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isNegative() {
		return negative;
	}

	public byte getByte(int i) {
		return dByte[i];
	}
}
