import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stkList = new ArrayList<>();

        for(int i = 0; i<arr.length;){
            if(stkList.size() < 1) {
                stkList.add(arr[i++]);
                continue;
            }
            if(stkList.get(stkList.size()-1) < arr[i]) stkList.add(arr[i++]);
            else stkList.remove(stkList.size()-1);
        }

        int[] stk = new int[stkList.size()];
        for(int i = 0; i<stkList.size(); i++){
            stk[i] = stkList.get(i).intValue();
        }
        return stk;
    }
}