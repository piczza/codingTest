class Solution {
    public int[] solution(int[] numbers, String direction) {
                int[] answer = new int[numbers.length];
        int endIdx = numbers.length - 1;
        int startIdx = 0;
        if(direction.equals("right")){
            for (int i = 0; i < numbers.length; i++) {
                if (i == startIdx) answer[i] = numbers[endIdx];
                else answer[i] = numbers[i - 1];
            }

        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                if (i == endIdx) answer[i] = numbers[startIdx];
                else answer[i] = numbers[i + 1];
            }

        }
        return answer;
    }
}