class Solution {
    public long solution(int price, int money, int count) {
        long sumPrice = 0;
        for (int i = 0; i <= count; i++) {
            sumPrice += (long) price * i;
        }
        return sumPrice - money <= 0 ? 0 : Math.abs(sumPrice - money);
    }
}