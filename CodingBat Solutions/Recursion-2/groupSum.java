public boolean groupSum(int start, int[] nums, int target) {
  // Base case: if there are no numbers left, then there is a
  // solution only if target is 0.
  if (start >= nums.length) return (target == 0);
  
  // Key idea: nums[start] is chosen or it is not.
  // Deal with nums[start], letting recursion
  // deal with all the rest of the array.
  
  // Recursive call trying the case that nums[start] is chosen --
  // subtract it from target in the call.
  if (groupSum(start + 1, nums, target - nums[start])) return true;
  
  // Recursive call trying the case that nums[start] is not chosen.
  if (groupSum(start + 1, nums, target)) return true;
  
  // If neither of the above worked, it's not possible.
  return false;
}
