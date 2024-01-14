import java.util.stream.IntStream;
class Solution {
    public int[] solution(String myString) {
        String[] temp = myString.split("x");
        return IntStream.range(0, myString.endsWith("x") ? temp.length+1 : temp.length)
                .map(x-> x == temp.length ? 0 : temp[x].length())
                .toArray();
    }
}