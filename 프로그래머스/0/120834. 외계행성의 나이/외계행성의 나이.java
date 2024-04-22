class Solution {
    public String solution(int age) {
        String ageNum = Integer.toString(age);
        String answer = "";
        for (int i = 0; i < ageNum.length(); i++) {
            answer += (char) (ageNum.charAt(i) + 49);
        }
        return answer;
    }
}