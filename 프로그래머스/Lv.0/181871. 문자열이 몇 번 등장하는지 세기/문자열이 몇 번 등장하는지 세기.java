class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        while(myString.indexOf(pat, idx) != -1){
            if(myString.substring(idx).startsWith(pat)){
                answer++;
            }
            idx++;
        }
        return answer;
    }
}