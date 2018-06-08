public int countHi(String str) {
  int count = 0;
  // Loop to length-1 so we can access index i and i+1 in the loop.
  for (int i = 0; i < (str.length() - 1); i++) {
    if (str.substring(i, i+2).equals("hi")) count++;
  }
  return count;
}
