class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head)
    {
        // code here
        if(head==null || head.next==null)
            return head;
            
        Node first = head;
        Node second = head.next;
        Node new_head = pairwiseSwap(head.next.next);
        
        second.next = first;
        first.next = new_head;
        return second;
    }
}