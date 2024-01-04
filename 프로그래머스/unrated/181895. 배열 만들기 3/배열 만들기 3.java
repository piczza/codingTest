import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < 2; i++){
            IntStream.rangeClosed(intervals[i][0], intervals[i][1])
                    .forEach(x->result.add(arr[x]));
        }
        
        int[] answer = new int[(intervals[0][1]-intervals[0][0]) + (intervals[1][1]-intervals[1][0]) + 2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}