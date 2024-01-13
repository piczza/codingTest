import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int[] arr2 = arr.clone();
         int answer = -1;
        do{
            answer++;
            arr = arr2.clone();
            for (int i = 0; i < arr2.length; i++) {
                if(arr2[i] >= 50 && arr2[i] % 2 == 0) arr2[i] = arr2[i] / 2;
                else if(arr2[i] < 50 && arr2[i] % 2 != 0) arr2[i] = (arr2[i] * 2) + 1;
            }
        } while(!Arrays.equals(arr, arr2));
        
        return answer;
    }
}