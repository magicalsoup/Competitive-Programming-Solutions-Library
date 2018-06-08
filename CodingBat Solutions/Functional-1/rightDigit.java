public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(n->n%10);
  return nums;
}
