class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toLowerCase().replaceAll("[a-z]", "");
        for (int i = 0; i < my_string.length(); i++) {
            answer += Integer.parseInt(my_string.split("")[i]);
        }
        return answer;
    }
}