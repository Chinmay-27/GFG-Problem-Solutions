class Solution {

    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int s) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                for (int k = j + 1; k < n - 1; k++) {
                    if (k > j + 1 && arr[k] == arr[k - 1])
                        continue;
                    for (int l = k + 1; l < n; l++) {
                        if (l > k + 1 && arr[l] == arr[l - 1])
                            continue;
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if (sum == s) {
                            ArrayList<Integer> temp = new ArrayList<Integer>(
                                    Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
