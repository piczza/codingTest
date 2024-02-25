import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        answer[0] = Arrays.stream(array).max().orElse(-1);
        for (int i = 0; i < array.length; i++) {
            if(array[i] == answer[0]) answer[1] = i;
        }
        return answer;
    }
}