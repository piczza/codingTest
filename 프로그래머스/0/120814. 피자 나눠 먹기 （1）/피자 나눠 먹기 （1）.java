class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < 7 * n; i++) {
            if((7*i) >= n) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}