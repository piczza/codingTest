import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int answerIdx = num_list.length % n == 0 ? num_list.length / n : num_list.length % n;

        return IntStream.range(0, num_list.length)
                .filter(x-> x % n == 0)
                .map(x->num_list[x])
                .toArray();
    }
}