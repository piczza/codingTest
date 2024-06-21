import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;
        
        for(int num : d){
            budget -= num;
            
            if(budget < 0) break;
            else result += 1;
        }
        
        return result;
    }
}