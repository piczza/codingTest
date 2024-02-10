import java.util.stream.IntStream;
class Solution {
    public int[] solution(int num, int total) {
        int temp = -100;
        while(temp++ <= total){
            int totalTemp = 0;
            for (int i = temp; i < temp + num; i++) {
                totalTemp += i;
            }
            if(totalTemp == total) break;
        }

        int[] answer = IntStream.range(temp, temp + num).toArray();
        return answer;
    }
}