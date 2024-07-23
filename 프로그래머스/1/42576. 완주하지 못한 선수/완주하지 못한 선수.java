import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String result = "";

        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) break;
        }

        return participant[i];
    }
}