class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> result = new ArrayList<>();

        // Create a red-black tree to store the maximum sum combinations
        NavigableMap<Integer, Integer> maxSumCombinations = new TreeMap<>(Collections.reverseOrder());

        // Calculate all possible sum combinations of elements from arrays A and B and add them to the red-black tree
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int sum = A[i] + B[j];
                maxSumCombinations.put(sum, maxSumCombinations.getOrDefault(sum, 0) + 1);
            }
        }


        // Extract the K maximum combinations from the red-black tree and add them to the result 
        int count = 0;
        for (Integer sum : maxSumCombinations.keySet()) {
            int frequency = maxSumCombinations.get(sum);
            for (int i = 0; i < frequency && count < K; i++) {
                result.add(sum);
                count++;
            }
            if (count == K) {
                break;
            }
        }

        return result;
    }
}