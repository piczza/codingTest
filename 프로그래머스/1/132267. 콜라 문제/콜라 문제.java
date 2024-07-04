class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        int nowBottle = 0;

        while (n > (a - 1)) {
            result += (n / a) * b;
            nowBottle = (n / a) * b;
            if(n % a != 0) nowBottle += n % a;
            n = nowBottle;

        }
        return result;
    }
}