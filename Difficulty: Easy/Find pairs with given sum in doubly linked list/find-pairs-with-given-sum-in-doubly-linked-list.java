/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        Node left = head;
        Node right = head;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(right.next != null) right = right.next;
        while(right.data > left.data){
            int sum = left.data + right.data;
            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                ans.add(pair);
                left = left.next;
                right = right.prev;
            }
            else if(sum > target){
                right = right.prev;
            }
            else left = left.next;
        }
        return ans;
    }
}
