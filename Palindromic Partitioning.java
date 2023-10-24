class Solution {
    static int palindromicPartition(String str) {
        int n = str.length();
        int[] dp = new int[n];
        boolean[][] isPalindrome = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            int minCuts = i; // Initialize with maximum cuts

            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == str.charAt(j) && (i - j <= 1 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;
                    minCuts = (j == 0) ? 0 : Math.min(minCuts, dp[j - 1] + 1); // palindrome true or false.
                }
            }

            dp[i] = minCuts; // making to array
        }

        return dp[n - 1]; // return
    }
}