class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int count = 0;
        int i = 1;
        while(i<=n){
            String digit = String.valueOf(i);
            if(digit.contains("4")){
                count++;
            }
            i = i+1;
        }
        return count;
    }
}