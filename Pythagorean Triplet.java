class Solution {

    boolean checkTriplet(int[] arr, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (map.containsKey(arr[i] + arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
