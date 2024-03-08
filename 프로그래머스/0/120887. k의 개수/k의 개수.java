class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int l = i; l < j+1; l++) {
            for (int m = 0; m <(l+"").split("").length; m++) {
                if((l+"").split("")[m].contains(""+k)) answer++;
            }
        }
        return answer;
    }
}