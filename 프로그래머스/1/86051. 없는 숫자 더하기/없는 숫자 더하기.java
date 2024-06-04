import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> numList = new ArrayList<>();
        for (int num : numbers){
            numList.add(num);
        }

        return IntStream.range(0, 10).filter(i -> !numList.contains(i)).sum();
    }
}