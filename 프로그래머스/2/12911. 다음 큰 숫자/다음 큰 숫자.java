class Solution {
    public int solution(int n) {
        int result = n;
        int num = countOneNum(n);

        while(true){
            result++;

            int num2 = countOneNum(result);
            if(num2 == num) break;
        }

        return result;
    }
    
    public int countOneNum (int n){
        int result = 1;
        while(n>1){
            if(n % 2 == 1) result++;
            n /= 2;
        }

        return result;
    }
}