class Solution {
    public String solution(String myString) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            Character temp = myString.charAt(i);
            answer += temp < 'l' ? "l" : temp;
        }
        return answer;
    }
}