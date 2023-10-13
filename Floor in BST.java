class Solution {
    public static int floor(Node root, int x) {
        return findFloor(root, x, -1);
    }

    public static int findFloor(Node root, int x, int floor) {
        if (root == null) {
            return floor;
        }
        if (root.data == x) {
            return x;
        }
        if (root.data < x) {
            return findFloor(root.right, x, root.data);
        }
        return findFloor(root.left, x, floor);
    }
}