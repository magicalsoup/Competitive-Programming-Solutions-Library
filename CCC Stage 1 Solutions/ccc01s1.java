import java.util.*;
public class ccc01s1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String cardList = x.nextLine();
		int grandTotal = 0;
		int points = 0;
		int numOfCards = 0;
		System.out.println("Cards Dealt           Points");
		for (int i=0; i<cardList.length(); i++) {
			if (cardList.substring(i, i+1).equals("C")) {
				System.out.print("Clubs ");
			}
			else if (cardList.substring(i, i+1).equals("D")) {
				if (numOfCards==0) {
					points += 3;
				}
				else if (numOfCards==1) {
					points += 2;
				}
				else if (numOfCards==2) {
					points += 1;
				}
				System.out.println("      " + points);
				grandTotal += points;
				points = 0;
				numOfCards = 0;
				System.out.print("Diamonds ");
			}
			else if (cardList.substring(i, i+1).equals("H")) {
				if (numOfCards==0) {
					points += 3;
				}
				else if (numOfCards==1) {
					points += 2;
				}
				else if (numOfCards==2) {
					points += 1;
				}
				System.out.println("      " + points);
				grandTotal += points;
				points = 0;
				numOfCards = 0;
				System.out.print("Hearts ");
			}
			else if (cardList.substring(i, i+1).equals("S")) {
				if (numOfCards==0) {
					points += 3;
				}
				else if (numOfCards==1) {
					points += 2;
				}
				else if (numOfCards==2) {
					points += 1;
				}
				System.out.println("      " + points);
				grandTotal += points;
				points = 0;
				numOfCards = 0;
				System.out.print("Spades ");
			}
			else {
				numOfCards++;
				System.out.print(cardList.substring(i, i+1) + " ");
				if (cardList.substring(i, i+1).equals("A")) {
					points += 4;
				}
				else if (cardList.substring(i, i+1).equals("K")) {
					points += 3;
				}
				else if (cardList.substring(i, i+1).equals("Q")) {
					points += 2;
				}
				else if (cardList.substring(i, i+1).equals("J")) {
					points += 1;
				}
			}
		}
		if (numOfCards==0) {
			points += 3;
		}
		else if (numOfCards==1) {
			points += 2;
		}
		else if (numOfCards==2) {
			points += 1;
		}
		System.out.println("      " + points);
		grandTotal += points;
		System.out.print("       Total " + grandTotal);
	}
}