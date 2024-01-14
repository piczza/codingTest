import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int[] len = new int[31];
        for (int i = 0; i < strArr.length; i++) {
            len[strArr[i].length()]++;
        }
        return Arrays.stream(len).max().orElse(-1);
    }
}