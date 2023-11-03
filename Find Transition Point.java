class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if (low >= n)
            return -1; // if the arr contains only 0's
        return low;
    }
}