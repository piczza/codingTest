class Solution {
     public int[] solution(int start, int end_num) {
       StringBuilder nums = new StringBuilder();
        for (int i = start; i >= end_num; i--){
            nums.append(i).append(",");
        }

        String[] numsArr = nums.toString().split(",");
        int[] answer = new int[numsArr.length];
        for (int i = 0; i < numsArr.length; i++) {
            answer[i] = Integer.parseInt(numsArr[i]);
        }
        return answer;
    }
}