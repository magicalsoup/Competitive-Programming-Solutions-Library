public int countX(String str) {
  // Base case -- return simple answer
  if (str.length() == 0) {
    return 0;
  }

  // Deal with the very front of the string (index 0) -- count "A" there.
  int count = 0;
  if (str.substring(0, 1).equals("x")) {
    count = 1;
  }

  // Make a recursive call to deal with the rest of string (the part beyond the front).
  // Add count to whatever the recursive call returns to make the final answer.
  // Note that str.substring(1) starts with char 1 and goes to the
  // end of the string.
  return count + countX(str.substring(1));
}
