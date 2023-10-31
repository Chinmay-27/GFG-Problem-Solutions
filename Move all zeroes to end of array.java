class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int count = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // If the current element is not zero, move it to the front
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining elements with zeros
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }
}
