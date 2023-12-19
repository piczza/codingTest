import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < intStrs.length; i++) {
            StringBuffer sbN = new StringBuffer(intStrs[i]);
            nums.add(Integer.parseInt(sbN.substring(s, s + l)));
        }
        
        int[] answer = nums.stream()
                .filter(i -> i > k)
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}