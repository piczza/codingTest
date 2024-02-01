import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        if(k % 2 == 0) answer = Arrays.stream(arr).map(num->num + k).toArray();
        if(k % 2 == 1) answer = Arrays.stream(arr).map(num->num * k).toArray();
        
        return answer;
    }
}