import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String[] split = s.split(" ", -1);
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            if(string.isEmpty()) continue;
            String[] strs = string.split("");
            String start = strs[0].toUpperCase();
            String str = "";
            for (int j = 1; j < strs.length; j++) {
                str += strs[j];
            }

            split[i] = start + str.toLowerCase();
        }

        return String.join(" ", split);
    }
}