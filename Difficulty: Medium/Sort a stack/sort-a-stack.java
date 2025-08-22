/*Complete the function below*/
class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty() || s.size() == 1) return s;
        int top = s.pop();
        sort(s);
        insert(top,s);
        return s;
    }
    public void insert(int top, Stack<Integer> s) {
        if(s.isEmpty() || s.peek() <= top){
            s.push(top);
            return;
        }
        int t = s.pop();
        insert(top, s);
        s.push(t);
    }
}