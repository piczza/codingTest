class Solution {
    public int solution(int num) {
        long numL = num;
        if(num == 1) return 0;

        for (int i = 0; i < 500; i++) {
            if(numL % 2 == 0) numL /= 2;
            else numL = numL * 3 + 1;

            if(numL == 1) return i + 1;
        }
        return -1;
        
    }
}