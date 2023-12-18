import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sbStr = new StringBuffer(my_string);
        for(int i = 0; i< queries.length; i++){
            StringBuffer sbStrNum = new StringBuffer();
            sbStrNum.append(sbStr.substring(queries[i][0], queries[i][1] + 1));
            sbStr.delete(queries[i][0], queries[i][1] + 1);
            sbStr.insert(queries[i][0], sbStrNum.reverse());
        }

        return sbStr.toString();
    }
}