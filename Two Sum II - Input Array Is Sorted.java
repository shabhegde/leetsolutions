class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int f = 0;
    int l = numbers.length - 1;

    while (numbers[f] + numbers[l] != target)
      if (numbers[f] + numbers[l] < target)
        ++f;
      else
        --l;

    return new int[] {f + 1, l + 1};
  }
}
