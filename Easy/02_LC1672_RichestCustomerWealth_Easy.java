// LeetCode 1672 - Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;
        for (int[] customer : accounts) {
            int total = 0;
            for (int money : customer) total += money;
            richest = Math.max(richest, total);
        }
        return richest;
    }
}
