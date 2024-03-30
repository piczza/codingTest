import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();

        // 2로 나눌 수 있는 만큼 나누기
        if (n % 2 == 0) {
            list.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // 홀수 소인수 찾기
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // 남은 n이 소수인 경우
        if (n > 2) {
            list.add(n);
        }

        // List를 int 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    
    }
}