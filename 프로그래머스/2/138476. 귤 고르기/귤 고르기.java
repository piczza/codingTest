import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            Integer value = map.getOrDefault(tangerine[i], 0);
            map.put(tangerine[i], value + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            k -= list.get(i);
            result++;

            if(k <= 0) break;
        }

        return result;
    }
}