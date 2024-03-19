import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String spellStr = Arrays.toString(spell);
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            String[] temp = dic[i].split("");
            Arrays.sort(temp);
            if(Arrays.toString(temp).equals(spellStr)) return 1;
        }
        return 2;
    }
}