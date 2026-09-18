class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low >= high) return;
        int part = partition(arr, low, high);
        quickSort(arr, low, part - 1);
        quickSort(arr, part+1, high);
        
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[high];
        int i = low;
        for(int  j =low; j <high; j++){
            if(arr[j] <= pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }
}