class Solution {
    public static void convertToWave(int n, int[] a) {
        for (int i = 0; i < n - 1; i += 2) {
            // Swap adjacent elements (a[i] and a[i+1])
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
    }
}

