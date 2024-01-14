import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]"))
                .filter(x->!x.isEmpty())
                .toArray(String[]::new);
         if(answer.length < 1) answer = new String[]{"EMPTY"};
        
        return answer;
    }
}