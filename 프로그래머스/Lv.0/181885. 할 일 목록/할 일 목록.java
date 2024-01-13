import java.util.*;
class Solution {
    public String[] solution(String[] todo, boolean[] finished) {
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < todo.length; i++){
            if(!finished[i]) list.add(todo[i]);
        }
        
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
}