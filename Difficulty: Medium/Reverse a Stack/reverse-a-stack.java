
class Solution {
    static void reverse(Stack<Integer> s) {
        // code here
        if(s.size() == 1) return;
        int temp = s.pop();
        reverse(s);
        insert(s, temp);
        return;
    }
    static void insert(Stack<Integer> s, int ele){
        if(s.size() == 0){
            s.push(ele);
            return;
        }
        int temp = s.pop();
        insert(s, ele);
        s.push(temp);
        return;
    }
}