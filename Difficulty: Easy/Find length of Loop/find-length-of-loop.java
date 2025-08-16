/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here.
        if(head == null) return 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                int length = 1;
                Node temp = slow.next;
                while(slow != temp){
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }
        return 0;
    }
}