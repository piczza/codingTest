import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        Arrays.sort(sides);
        if(sides[sides.length-1] >= Arrays.stream(sides).sum() - sides[sides.length-1]) answer = 2;
        return answer;
    }
}