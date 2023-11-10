class Solution {
    static final int CHAR = 256;

    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        if (m != n) {
            return false;
        }

        int[] m1 = new int[CHAR];
        int[] m2 = new int[CHAR];

        for (int i = 0; i < CHAR; i++) {
            m1[i] = -1;
            m2[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int ch1 = (int) str1.charAt(i);
            int ch2 = (int) str2.charAt(i);

            if (m1[ch1] == -1) {
                m1[ch1] = ch2;
            } else if (m1[ch1] != ch2) {
                return false;
            }

            if (m2[ch2] == -1) {
                m2[ch2] = ch1;
            } else if (m2[ch2] != ch1) {
                return false;
            }
        }
        return true;
    }
}