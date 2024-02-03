class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            if(answer[i][i] == 0) answer[i][i] = 1;
        }
        return answer;
    }
}