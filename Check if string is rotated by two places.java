class Solution {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2) {
        // Your code here
        int s = str1.length();
        if (str2.length() != s)
            return false;
        if (s <= 2 && str1.equals(str2))
            return true;
        // left check
        String a1 = str1.substring(2) + str1.substring(0, 2);
        // right check
        String a2 = str1.substring(s - 2) + str1.substring(0, s - 2);
        return a1.equals(str2) || a2.equals(str2);
    }

}