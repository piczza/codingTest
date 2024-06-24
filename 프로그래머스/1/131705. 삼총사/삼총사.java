import java.util.*;
class Solution {
    static int solution(int[] number) {
        int[] nums = Arrays.copyOfRange(number, 0, number.length);
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(i == k || j == k) continue;

                    if(0 == nums[i] + nums[j] + nums[k]) result++;

                }

            }
        }
        return result;
    }
}