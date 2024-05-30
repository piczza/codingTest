class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(x == 0) return answer;
        for(long i = x; (n * x) < 0 ? i >= (long) n *x : i <= (long) n * x; i += x){
            int idx = (int) (i/x)-1;
            answer[idx] = i;
        }
        return answer;
    }
}