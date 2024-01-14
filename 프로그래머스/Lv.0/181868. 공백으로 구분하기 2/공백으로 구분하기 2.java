import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        return Arrays.stream(my_string.split(" "))
                .filter(x->!x.equals(""))
                .toArray(String[]::new);
    }
}