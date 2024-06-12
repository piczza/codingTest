import java.util.stream.IntStream;
class Solution {
    public int solution(int left, int right) {
        int min = Math.min(left, right);
        int max = Math.max(left, right);
        int result = 0;
        for (int i = min; i <= max; i++) {
            int finalI = i;
            long count = IntStream.range(1, i + 1).filter(j -> finalI % j == 0).count();
            if(count % 2 == 0) result += i;
            else result -= i;

        }
        return result;
    }
}