import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        int result = 0;
        boolean isContinue = true;
        while (!pq.isEmpty() && isContinue) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    result++;
                    pq.poll();
                    if (i == location) {
                        isContinue = false;
                        break;
                    }
                }
            }

        }

        return result;
    }
}