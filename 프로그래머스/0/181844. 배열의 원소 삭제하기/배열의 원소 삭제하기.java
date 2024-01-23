import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isSame = false;
            for (int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) isSame = true;
            }
            if(!isSame) temp.add(arr[i]);
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}