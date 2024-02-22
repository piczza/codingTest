import java.util.*;
import java.util.function.Predicate;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Long answer = Arrays.stream(s1).filter(str -> Arrays.stream(s2).anyMatch(Predicate.isEqual(str))).count();
        return answer.intValue();
    }
}