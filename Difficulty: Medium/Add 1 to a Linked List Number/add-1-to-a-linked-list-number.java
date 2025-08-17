/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        int carry = helper(head);
        if(carry == 1){
            Node nn = new Node(1);
            nn.next = head;
            return nn;
        }
        return head;
    }
    public int helper(Node temp){
        if(temp == null){
            return 1;
        }
        int carry = helper(temp.next);
        temp.data += carry;
        if(temp.data < 10){
            return 0;
        }
        temp.data = 0;
        return 1;
    }
}