class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = num_list;
        int num1 = answer[answer.length-2];
        int num2 = answer[answer.length-1];
        int[] newAnswer = new int[answer.length + 1];
        int addNum = 0;
        
        addNum = (num2 > num1 ? num2-num1 : num2 * 2);
        
        for(int i = 0; i<answer.length; i++){
            newAnswer[i] = answer[i];
        }
        newAnswer[answer.length] = addNum;
        
        
        return newAnswer;
    }
}