class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_strings.length; i++) {
            StringBuilder str = new StringBuilder(my_strings[i]);
            answer.append(str.substring(parts[i][0], parts[i][1]+1));
        }

        return answer.toString();
    }
}