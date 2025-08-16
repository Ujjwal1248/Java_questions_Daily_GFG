/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        if (head == null || head.next == null) return head;

        Node temp = head;
        Node dummy0 = new Node(-1);
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);

        Node temp0 = dummy0;
        Node temp1 = dummy1;
        Node temp2 = dummy2;

        // Step 1: Divide nodes into 3 lists
        while (temp != null) {
            if (temp.data == 0) {
                temp0.next = temp;
                temp0 = temp0.next;
            } else if (temp.data == 1) {
                temp1.next = temp;
                temp1 = temp1.next;
            } else {
                temp2.next = temp;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        // Step 2: Connect the lists
        if (dummy1.next != null) {
            temp0.next = dummy1.next;   // connect 0s → 1s
        } else {
            temp0.next = dummy2.next;   // if no 1s, connect 0s → 2s
        }

        if (dummy2.next != null) {
            temp1.next = dummy2.next;   // connect 1s → 2s
        } else {
            temp1.next = null;          // if no 2s, end after 1s
        }

        temp2.next = null;  // terminate final list

        // Step 3: Return the right head
        return dummy0.next != null ? dummy0.next 
               : (dummy1.next != null ? dummy1.next : dummy2.next);
    }
}

