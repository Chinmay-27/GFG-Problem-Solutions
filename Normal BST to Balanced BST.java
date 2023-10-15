import java.util.*;
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class GfG
{
    void inorder(Node root, ArrayList<Node> arr){
        if(root == null)
        return;
        inorder(root.left, arr);
        arr.add(root);
        inorder(root.right, arr);
    }
    Node modifyBST(ArrayList<Node> arr, int l, int r){
        if(l > r)
        return null;
        int mid = (l + r)/2;
        arr.get(mid).left = modifyBST(arr, l, mid - 1);
        arr.get(mid).right = modifyBST(arr, mid + 1, r);
        return arr.get(mid);
    }
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        ArrayList<Node> arr = new ArrayList<>();
        inorder(root, arr);
        return modifyBST(arr, 0, arr.size() - 1);
    }
}