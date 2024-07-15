class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int work = section[section.length - 1];

        for (int i = section.length - 1; i >= 0; i--) {
            if(section[i] > work) continue;
            if(work > section[i]) work = section[i];
            work -= m;
            result++;

        }

        return result;
    }
}