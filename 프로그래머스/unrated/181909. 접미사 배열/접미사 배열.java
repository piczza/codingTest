import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            strs.add(my_string.substring(i));
        }
        Collections.sort(strs);
        return strs.stream().toArray(String[]::new);
        
    }
}