class Solution {
    public int solution(int number, int limit, int power) {
        int atk = 0;

        for (int i = 1; i <= number; i++) {
            int weponNum = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) weponNum++;
                else if(i % j == 0) weponNum += 2;
            }

            if(weponNum > limit) atk += power;
            else atk += weponNum;
        }

        return atk;
    }
}