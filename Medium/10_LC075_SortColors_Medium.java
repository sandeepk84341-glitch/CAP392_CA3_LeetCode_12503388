// LeetCode 75 - Sort Colors
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, current = 0, high = nums.length - 1;
        while (current <= high) {
            if (nums[current] == 0) swap(nums, low++, current++);
            else if (nums[current] == 1) current++;
            else swap(nums, current, high--);
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a]; nums[a] = nums[b]; nums[b] = temp;
    }
}
