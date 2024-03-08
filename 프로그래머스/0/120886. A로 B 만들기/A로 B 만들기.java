import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        Arrays.toString(beforeArr).equals(afterArr);

        before = Arrays.toString(beforeArr);
        after = Arrays.toString(afterArr);
        return before.equals(after) ? 1 : 0;
    }
}