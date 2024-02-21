class Solution {
    public int solution(int num, int k) {
        int answer = (num + "").indexOf(k+"")+1;
        return answer == 0 ? -1 : answer;
    }
}