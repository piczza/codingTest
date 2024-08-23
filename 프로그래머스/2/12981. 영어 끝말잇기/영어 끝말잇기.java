import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        boolean isEnd = false;
        int falseIdx = 0;
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        for (int i = 0; i < words.length-1; i++) {
            String endStr = words[i].split("")[words[i].length()-1];
            String startStr = words[i + 1].split("")[0];
            set.add(words[i+1]);

            if(!startStr.equals(endStr) || set.size()!= i + 2){
                falseIdx = i + 1;
                isEnd = true;
                break;
            }

        }
        if(!isEnd) return new int[]{0, 0};

        int num = falseIdx % n;
        int order = falseIdx / n;


        return new int[]{num + 1, order + 1};
    }
}