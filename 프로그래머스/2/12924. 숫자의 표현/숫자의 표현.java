class Solution {
    public int solution(int n) {
        int result = 1;
        for (int num = 1; num < n/2 + 1; num++) {
            int temp = 0;
            for (int i = num; i <= n / 2 + 1; i++) {
                temp += i;
                if(temp == n) result++;
                if(temp >= n) break;

            }
        }

        return result;
    }
}