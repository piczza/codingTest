class Solution {
    public int solution(int[] array, int n) {
        int answer = 100;
        for (int num : array) {
            if(Math.abs(answer - n) > Math.abs(num - n)) answer = num;
            else if(Math.abs(answer - n) == Math.abs(num - n)) answer = answer > num ? num : answer;
        }
        return answer;
    }
}