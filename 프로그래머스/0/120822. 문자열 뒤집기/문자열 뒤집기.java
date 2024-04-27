class Solution {
    public String solution(String my_string) {
        String[] strs = my_string.split("");
        
        String answer = "";
        for (int i = strs.length - 1; i >= 0; i--) {
            answer += strs[i];
        }
        return answer;
    }
}