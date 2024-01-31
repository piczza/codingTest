class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for (int i = 0; i < picture.length; i++) {
            String temp = "";
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    temp += picture[i].charAt(j);
                }
            }
            for (int j = i*k; j < k*(i+1); j++) {
                answer[j] = temp;
            }

        }
        return answer;
    }
}