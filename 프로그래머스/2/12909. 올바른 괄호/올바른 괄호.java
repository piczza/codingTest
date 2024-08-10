import java.util.*;
class Solution {
    boolean solution(String s) {
        int leftIdx = 0;
        int rightIdx = 0;
        boolean result = true;

        String[] split = s.split("");
        if(split[0].equals(")") || split[split.length-1].equals("(")) return false;
        for (int i = 0; i < s.length(); i++) {
            if(rightIdx > leftIdx) return false;
            if(split[i].equals("(")) leftIdx++;
            else rightIdx++;

            if(leftIdx > 0 && rightIdx > 0){
                int min = Math.min(leftIdx, rightIdx);

                leftIdx -= min;
                rightIdx -= min;
            }
        }

        if(rightIdx != leftIdx) result = false;
        return result;
    }
}