class Solution {
    // Function to flatten a linked list
    
    Node flatten(Node root) {
        // code here
        if(root == null || root.next == null) return root;
        Node mergedHead = flatten(root.next);
        return merge(root, mergedHead);
    }
    public static Node merge(Node l1, Node l2){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(l1 != null && l2 != null){
            if(l1.data > l2.data){
                res.bottom = l2;
                res = l2;
                l2 = l2.bottom;
            }
            else{
                res.bottom = l1;
                res = l1;
                l1 = l1.bottom;
            }
            res.next = null;
        }
        if(l1 != null) res.bottom = l1;
        else res.bottom = l2;
        return dummyNode.bottom;
    }
}