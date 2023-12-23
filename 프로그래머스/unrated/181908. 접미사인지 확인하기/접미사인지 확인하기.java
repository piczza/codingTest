class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] strs = new String[my_string.length()];
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(i).equals(is_suffix)){
                answer = 1;
            }
        }
        
        return answer;
    }
}