import java.util.*;
class Solution {
    public String solution(String s) {
        List sortList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int temp = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.split("")[i] .equals(s.split("")[j])) temp++;
            }
            if(temp < 2) sortList.add(s.split("")[i]);
        }
        sortList.sort(Comparator.naturalOrder());
        String answer = "";
        for (int i = 0; i < sortList.size(); i++) {
            answer += sortList.get(i);
        }
        return answer;
    }
}