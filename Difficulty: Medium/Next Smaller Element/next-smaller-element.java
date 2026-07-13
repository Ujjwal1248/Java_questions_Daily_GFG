class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ll.add(-1);
            else ll.add(st.peek());
            st.push(arr[i]);
        }
        Collections.reverse(ll);
        return ll;
    }
}