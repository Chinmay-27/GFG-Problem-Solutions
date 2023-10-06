/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node odd)
    {
        if(odd.next==null) return;
        Node temp=odd,temp1=odd.next,prev=odd;
        temp.next=temp.next.next;
        temp1.next=null;
        temp=temp.next;
        while(temp!=null && temp.next!=null){
            Node temp2=temp.next.next;
            temp.next.next=temp1;
            temp1=temp.next;
            temp.next=temp2;
            prev=temp;
            temp=temp.next;
        }
        if(temp!=null){
            temp.next=temp1;
        }
        else{
            prev.next=temp1;
        }
        
    }
}