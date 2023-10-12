import java.util.*;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


class Solution {
    private HashSet<String> set; // using a HashSet to store the serialized string representations of subtrees
    boolean found = false; // flag to indicate if a duplicate subtree has been found

    int dupSub(Node root) {
        set = new HashSet<String>(); // initialize the HashSet
        dfs(root); // perform depth-first search on the tree
        if (found) return 1; // if a duplicate subtree has been found, return 1
        return 0; // if no duplicate subtree has been found, return 0
    }

    private String dfs(Node root) {
        StringBuilder s = new StringBuilder(); // create a StringBuilder to construct the serialized string representation of the subtree
        if (root == null) {
            return "#"; // return "#" to represent a null node
        }
        if (root.left==null && root.right==null) return root.data+" "; // return the data of a leaf node followed by a space

        s.append(root.data+" "); // append the data of the current node followed by a space
        s.append(dfs(root.left)); // recursively append the serialized string representation of the left subtree
        s.append(dfs(root.right)); // recursively append the serialized string representation of the right subtree
        
        if (set.contains(s.toString())) found = true; // if the serialized string representation of the subtree is already in the HashSet, set the found flag to true
        else set.add(s.toString()); // otherwise, add the serialized string representation of the subtree to the HashSet
        
        return s.toString(); // return the serialized string representation of the subtree
    }
}