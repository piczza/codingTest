import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char c = keymap[i].charAt(j);
                if(map.containsKey(c)){
                    if(map.get(c) > j + 1) map.put(c, j + 1);
                }
                else map.put(c, j + 1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            int num = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                char alphabet = targets[i].charAt(j);
                if(!map.containsKey(alphabet)) {
                    num = 0;
                    break;
                }
                num += map.get(alphabet);
            }
            if(num != 0) result[i] = num;
            else result[i] = -1;
        }


        return result;
    }
}