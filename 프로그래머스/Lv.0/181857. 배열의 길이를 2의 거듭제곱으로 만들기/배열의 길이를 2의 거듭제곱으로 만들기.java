import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int idx = 1;
        while(idx < arr.length){
            idx*=2;
        }
        return Arrays.copyOfRange(arr, 0, idx);
    }
}