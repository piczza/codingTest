class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int idx = 0;
        for (int i = n; idx < num_list.length; i++) {
            if(i == num_list.length) i = 0;
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}