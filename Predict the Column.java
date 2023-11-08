class Solution {
    int columnWithMaxZeros(int arr[][], int N) {
        int maxZeros = 0; // Initialize the maximum zeros count
        int columnIndex = -1; // Initialize the column index

        for (int j = 0; j < N; j++) {
            int zeros = 0; // Count of zeros in the current column
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == 0) {
                    zeros++;
                }
            }
            if (zeros > maxZeros) {
                maxZeros = zeros;
                columnIndex = j;
            }
        }

        // If the maximum zeros count is still 0, no column has more zeros
        return maxZeros > 0 ? columnIndex : -1;
    }
}
