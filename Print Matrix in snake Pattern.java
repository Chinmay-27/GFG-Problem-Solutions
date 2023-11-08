
class Solution {
    // Function to return a list of integers visited in snake pattern in the matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        boolean start_side = true;
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            if (start_side) {
                for (int j = 0; j < matrix[0].length; j++) {
                    arr.add(matrix[i][j]);
                }
            } else {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    arr.add(matrix[i][j]);
                }
            }
            start_side = !start_side;
        }

        return arr;
    }
}
