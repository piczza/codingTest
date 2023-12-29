import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer, 0);

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            int cN = c;
            if(Character.isUpperCase(c)) answer[cN - 65]++;
            else answer[cN - 71]++;
        }
        
        return answer;
    }
}