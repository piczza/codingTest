import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] temp = Arrays.stream(arr).distinct().toArray();
        for (int i = 0; i < k; i++) {
            if( i < temp.length) answer[i] = temp[i];
            else answer[i] = -1;
        }
        
        return answer;
    }
}