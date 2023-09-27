import java.util.*;

class Solution {
    // Function for finding the pair with the closest sum to x
    public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
        int left = 0; // Pointer for arr[]
        int right = m - 1; // Pointer for brr[]
        int diff = Integer.MAX_VALUE; // Initialize the minimum absolute difference
        int resultX = 0; // Initialize the first element of the result pair
        int resultY = 0; // Initialize the second element of the result pair

        // Traverse both arrays from left to right
        while (left < n && right >= 0) {
            // Calculate the current sum of elements from both arrays
            int sum = arr[left] + brr[right];

            // Update the result pair if the current sum is closer to x
            if (Math.abs(sum - x) < diff) {
                resultX = arr[left];
                resultY = brr[right];
                diff = Math.abs(sum - x);
            }

            // If the current sum is less than x, move the left pointer to the right
            if (sum < x) {
                left++;
            }
            // If the current sum is greater than or equal to x, move the right pointer to the left
            else {
                right--;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(resultX);
        result.add(resultY);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7};
        int brr[] = {10, 20, 30, 40};
        int x = 38;
        int n = arr.length;
        int m = brr.length;

        ArrayList<Integer> closestPair = printClosest(arr, brr, n, m, x);

        System.out.println("Closest Pair: (" + closestPair.get(0) + ", " + closestPair.get(1) + ")");
    }
}
