import java.util.Arrays;
class Solution {
    public boolean solution(int x) {
        int sum = Arrays.stream(Integer.toString(x).split("")).mapToInt(Integer::parseInt).sum();
        if (x % sum == 0) return true;
        else return false;
    }
}