// LeetCode 273 - Integer to English Words
class Solution {
    private final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";
        StringBuilder result = new StringBuilder();
        int group = 0;
        while (num > 0) {
            int part = num % 1000;
            if (part != 0) {
                String words = threeDigitsToWords(part);
                if (!thousands[group].isEmpty()) words += " " + thousands[group];
                if (result.length() == 0) result.insert(0, words);
                else result.insert(0, words + " ");
            }
            num /= 1000;
            group++;
        }
        return result.toString().trim();
    }

    private String threeDigitsToWords(int num) {
        StringBuilder words = new StringBuilder();
        if (num >= 100) {
            words.append(belowTwenty[num / 100]).append(" Hundred");
            num %= 100;
            if (num > 0) words.append(" ");
        }
        if (num >= 20) {
            words.append(tens[num / 10]);
            num %= 10;
            if (num > 0) words.append(" ").append(belowTwenty[num]);
        } else if (num > 0) {
            words.append(belowTwenty[num]);
        }
        return words.toString();
    }
}
