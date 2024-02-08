class Solution {
    public int solution(String[] babbling) {
        String[] baby = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (int i = 0; i < baby.length; i++) {
            for (int j = 0; j < babbling.length; j++) {
                babbling[j] = babbling[j].replace(baby[i], " ");
            }
        }
        for (String str : babbling) {
            if(str.trim().length() <= 0) answer++;
        }
        return answer;
    }
}