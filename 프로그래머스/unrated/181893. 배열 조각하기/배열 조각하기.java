import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            switch (i % 2){
                case 0:
                    arr = Arrays.copyOfRange(arr, 0, query[i] + 1); break;
                case 1:
                    arr = Arrays.copyOfRange(arr, query[i], arr.length); break;
            }
        }
        
        return arr;
    }
}