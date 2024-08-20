import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        people = Arrays.stream(people).sorted().toArray();
        Deque<Integer> deque = new LinkedList<>();
        int result = 0;
        for (int p : people){
            deque.add(p);
        }

        while(deque.size() > 0){
            Integer last = deque.peekLast();
            Integer first = deque.peekFirst();

            if(last + first > limit) {
                result++;
                deque.pollLast();
            }
            else{
                result += 1;
                deque.pollLast();
                deque.pollFirst();
            }
        }

        return result;
    }
}