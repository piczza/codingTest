import java.util.stream.LongStream;
class Solution {
    public long solution(int a, int b) {
        long maxNum = Math.max(a, b);
        long minNum = Math.min(a, b);
        return  LongStream.iterate(minNum, i -> i + 1)
                .limit(maxNum-minNum + 1)
                .sum();
    }
}