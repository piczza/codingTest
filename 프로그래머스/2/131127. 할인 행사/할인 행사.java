import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 10 + 1; i++){
            Map<String, Integer> dMap = new HashMap<>();
            boolean isEqueal = true;

            for(int j = 0; j < 10; j++){
                dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);
            }


            for(String key : map.keySet()){
                if(map.get(key) != dMap.get(key)){
                    isEqueal = false;
                    break;
                }
            }

            if(isEqueal) result++;
        }

        return result;
    }
}