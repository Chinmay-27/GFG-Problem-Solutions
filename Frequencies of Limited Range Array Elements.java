import java.util.*;

class Solution {
    public static void frequencyCount(int arr[], int N, int P) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i = 0; i < N; i++)
            arr[i] = map.containsKey(i + 1) ? map.get(i + 1) : 0;
    }
}