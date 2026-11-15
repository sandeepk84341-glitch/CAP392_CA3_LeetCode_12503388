// LeetCode 1295 - Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int number : nums) {
            int digits = 0;
            do { digits++; number /= 10; } while (number != 0);
            if (digits % 2 == 0) count++;
        }
        return count;
    }
}
