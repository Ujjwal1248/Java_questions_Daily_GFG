class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        class Pair{
            int start, end;
            Pair(int s, int e){
                this.start = s;
                this.end = e;
            }
        }
        int n = start.length;
        Pair[] meeting = new Pair[n];
        for(int i = 0; i<n; i++){
            meeting[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(meeting, (a,b)->a.end-b.end);
        int count = 1;
        int lastEnd = meeting[0].end;
        
        for(int i =1; i < n;i++){
            if(meeting[i].start > lastEnd){
                count++;
                lastEnd = meeting[i].end;
            }
        }
        
        return count;
    }
}
