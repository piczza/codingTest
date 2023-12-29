import java.util.stream.IntStream;
class Solution {
    public int[] solution(int n, int k) {
        int[] nums = IntStream.rangeClosed(1, n)
                .filter(x -> x % k == 0)
                .toArray();
        return nums;
    }
}