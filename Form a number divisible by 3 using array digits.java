class Solution {

    static int isPossible(int N, int arr[]) {
        int digit, sum = 0;
        for (int i = 0; i < N; i++) {
            int num = arr[i];
            while (num > 0) {
                digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
        }
        return sum % 3 == 0 ? 1 : 0;
    }
}
