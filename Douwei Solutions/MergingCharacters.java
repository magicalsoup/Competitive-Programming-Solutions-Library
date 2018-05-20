package Douwei;
import java.util.Scanner;
import java.util.Stack;
public class MergingCharacters {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	System.out.print(removeAdjacentDuplicateCharacters(str));
}
  public static String removeAdjacentDuplicateCharacters(final String candidate) {
    if (candidate.length() < 2) {
      return candidate;
    }

    final Stack<Character> originalCharacters = new Stack<>();
    for (char c : candidate.toCharArray()) {
      originalCharacters.push(c);
    }
    final Stack<Character> filteredCharacters = MergingCharacters.filterAdjacentDuplicateCharacters(originalCharacters);
    final StringBuilder stringBuilder = new StringBuilder();
    while (!filteredCharacters.empty()) {
      stringBuilder.append(filteredCharacters.pop());
    }
    return stringBuilder.toString();
  }

  public static Stack<Character> filterAdjacentDuplicateCharacters(final Stack<Character> characters) {
    if (characters.size() < 2) {
      return characters;
    }

    final Stack<Character> filteredCharacters = new Stack<>();
    while (!characters.empty()) {
      final char poppedChar = characters.pop();
      if (filteredCharacters.empty() || poppedChar != filteredCharacters.peek()) {
        filteredCharacters.push(poppedChar);
      } else {
        filteredCharacters.pop();
      }
    }

    return filteredCharacters;
  }
}/*
short handed :

import java.util.Scanner;
import java.util.Stack;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
 
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (!c.isEmpty() && ch == c.peek()) {
                c.pop();
            } else {
                c.push(ch);
            }
        }
 
        for (Character character : c) {
            System.out.print(character);
        }
        System.out.println();
    }
}





*/