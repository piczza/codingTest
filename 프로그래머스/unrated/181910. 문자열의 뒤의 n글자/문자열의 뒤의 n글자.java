class Solution {
    public String solution(String my_string, int n) {
        String answer;
        StringBuilder sb = new StringBuilder(my_string);


        answer = sb.reverse().substring(0, n);
        StringBuilder sb2 = new StringBuilder(answer);
        return sb2.reverse().toString();
    }
}