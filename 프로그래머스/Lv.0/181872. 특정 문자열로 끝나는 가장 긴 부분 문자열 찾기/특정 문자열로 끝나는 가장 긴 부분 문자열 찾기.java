class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i = myString.length(); i > 0; i--) {
            String temp = myString.substring(0, i);
            if(temp.endsWith(pat)){
                answer += temp;
                break;
            }
        }
        return answer;
    }
}