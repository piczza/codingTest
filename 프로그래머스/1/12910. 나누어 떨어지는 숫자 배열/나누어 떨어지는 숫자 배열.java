import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> numList = new ArrayList<>();
        for (int num : arr){
            if(num % divisor == 0) numList.add(num);
        }

        return !numList.isEmpty() ? numList.stream().mapToInt(Integer::intValue).toArray() : new int[] {-1};
    }
}