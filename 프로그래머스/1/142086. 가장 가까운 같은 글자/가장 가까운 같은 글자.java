import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.split("")[i];
            if(!map.containsKey(str)) {
                map.put(str, i);
                result[i] = -1;
            }
            else {
                result[i] = i - map.get(str);
                map.put(str, i);
            }
        }
        return result;
    }
}