class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int divisor = 0;
            for (int j = 1; j <= i/2; j++) {
                if(j*j == i) divisor++;
                else if (i % j == 0) divisor += 2;
            }
            
            if (divisor >= 3) answer ++;

        }
        return answer;
    }
}