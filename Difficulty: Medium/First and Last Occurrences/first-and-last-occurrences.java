// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int n1 = helper1(arr,x,0);
        int n2 = helper2(arr,x,arr.length-1);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        return list;
    }
    public int helper1(int[] arr, int x, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x) return idx;
        return helper1(arr, x, idx + 1);
    }
    public int helper2(int[] arr, int x, int idx){
        if(idx < 0){
            return -1;
        }
        if(arr[idx] == x) return idx;
        return helper2(arr, x, idx -1);
    }
}

