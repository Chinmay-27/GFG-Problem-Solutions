class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int mask = 1;
        mask = mask << k;
        return ((mask & n) >> k) == 1;
    }

}