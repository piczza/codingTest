class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] set : db) {
            boolean isIdCheck = id_pw[0].equals(set[0]);
            boolean isPasswordCheck = id_pw[1].equals(set[1]);
            if(!isIdCheck) answer = "fail";
            if(isIdCheck && !isPasswordCheck) {
                answer = "wrong pw";
                break;
            }
            if(isIdCheck && isPasswordCheck) {
                answer = "login";
                break;
            }
        }
        return answer;
    }
}