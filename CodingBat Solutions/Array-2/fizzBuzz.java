public String[] fizzBuzz(int start, int end) {
  String[] str = new String[end];
  String[] ans = new String[end-start];
  int j= 0;
  for(int i=start;i<end;i++){
    if(i%15==0)
    str[i] = "FizzBuzz";
    else if(i%5==0)
    str[i] = "Buzz";
    else if(i%3==0)
    str[i] = "Fizz";
    else
    str[i] = String.valueOf(i);
    ans[j] = str[i];
    j++;
  }
  return ans;
}
