import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] strs = new String[]{"code","date","maximum","remain"};
        int extNum = 0, sort_byNum = 0;
        for (int i = 0; i < 4; i++) {
            if(ext.equals(strs[i])) extNum = i;
            if(sort_by.equals(strs[i])) sort_byNum = i;
        }

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if(data[i][extNum] < val_ext) list.add(data[i]);
        }

        final int num = sort_byNum;
        Collections.sort(list, (arr1, arr2) -> arr1[num] - arr2[num]);
        
        int[][] result = new int[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}