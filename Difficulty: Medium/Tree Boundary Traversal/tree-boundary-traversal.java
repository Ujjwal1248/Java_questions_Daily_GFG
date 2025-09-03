/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isLeaf(Node root){
        return root != null && root.left == null && root.right == null;
    }
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(isLeaf(node) == false) res.add(node.data);
        leftTraversal(node, res);
        leafTraversal(node, res);
        rightTraversal(node, res);
        return res;
    }
    public void leftTraversal(Node root, ArrayList<Integer> res){
        Node curr = root.left;
        while(curr != null){
            if(isLeaf(curr) == false) res.add(curr.data);
            if(curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
    public void rightTraversal(Node root, ArrayList<Integer> res){
        Node curr = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while(curr != null){
            if(isLeaf(curr) == false) tmp.add(curr.data);
            if(curr.right != null) curr = curr.right;
            else curr = curr.left;
        }
        for(int i = tmp.size() -1; i >= 0; i--){
            res.add(tmp.get(i));
        }
    }
    public void leafTraversal(Node root, ArrayList<Integer> res){
        if(isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if(root.left != null) leafTraversal(root.left, res);
        if(root.right != null) leafTraversal(root.right, res);
        
    }
}