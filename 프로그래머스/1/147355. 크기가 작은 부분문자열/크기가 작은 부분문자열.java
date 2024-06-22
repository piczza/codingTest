import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        List<Long> numList = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < t.length() - (length - 1); i++) {
            String subStr = t.substring(i, i + length);
            numList.add(Long.parseLong(subStr));
        }

        for (Long num : numList){
            if(num <= Long.parseLong(p)) result++;
        }

        return result;
    }
}