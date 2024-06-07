import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(-1);
        int[] array = Arrays.stream(arr).filter(i -> i != min).toArray();
        return array.length == 0 ? new int[]{-1} : array;
    }
}