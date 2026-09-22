class Solution {
    class Time{
        int start;
        int end;
        Time(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        Time[] time = new Time[n];
        for(int i = 0; i < n; i++){
            time[i] = new Time(start[i], finish[i]);
        }
        Arrays.sort(time, (a,b)->a.end - b.end);
        int count = 1;
        int lastEnd = time[0].end;
        for(int i = 1;i < n; i++){
            if(time[i].start > lastEnd){
                count++;
                lastEnd = time[i].end;
            }
        }
        return count;
    }
}
