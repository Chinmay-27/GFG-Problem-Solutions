class Solution {
    String colName(long n) {
        StringBuilder newStr = new StringBuilder();
        while (n > 0) {
            n--;
            newStr.append((char) ('A' + n % 26));
            n = n / 26;
        }
        return newStr.reverse().toString();
    }
}