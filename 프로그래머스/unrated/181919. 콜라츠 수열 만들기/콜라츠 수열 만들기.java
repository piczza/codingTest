import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int n) {
        int idx = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while(n > 1){
            answer.add(n);
            idx++;
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
        }
        answer.add(1);
        
        int[] result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i).intValue();
        }
        return result;
    }
}