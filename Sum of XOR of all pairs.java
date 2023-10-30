// class Solution {

//     // Function for finding maximum and value pair
//     public long sumXOR(int arr[], int n) {
//         int sum = 0;
//         for (int i = 0; i <= n - 2; i++) {
//             for (int j = i + 1; j <= n - 1; j++) {
//                 sum = sum + (arr[i]^arr[j]);
//             }
//         }
//         return sum;
//     }
// }

class Solution {

    public long sumXOR(int arr[], int n) {
        long sumXOR = 0;
        for (int i = 0; i < 31; i++) {
            int countZero = 0;
            int countOne = 0;

            for (int j = 0; j < n; j++) {
                if ((arr[j] & (1 << i)) == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
            }

            // For each bit position, add the contribution of XOR for 0s and 1s.
            sumXOR += (long) countZero * countOne * (1 << i);
        }

        return sumXOR;
    }
}
