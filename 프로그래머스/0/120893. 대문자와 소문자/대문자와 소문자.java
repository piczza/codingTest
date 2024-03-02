class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.split("")[i];
            if(temp.equals(temp.toLowerCase()))answer += temp.toUpperCase();
            else answer += temp.toLowerCase();
        }
        return answer;
    }
}