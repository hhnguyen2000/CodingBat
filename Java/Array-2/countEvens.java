// problem: https://codingbat.com/prob/p162010
// Return the number of even ints in the given array.

public int countEvens(int[] nums) {
  int count = 0;
  
  for (int n : nums) {
    if (n % 2 == 0) {
      count ++;
    }
  }
  
  return count;
}
