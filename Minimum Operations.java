class Solution {
    public int helper(int start, int target) {
        if (start == target) {
            return 0;
        }
        if (target % 2 == 0) {
            return 1 + helper(start, target / 2);
        } else {
            return 1 + helper(start, target - 1);
        }
    }

    public int minOperation(int n) {
        // code here.
        return helper(0, n);
    }
}