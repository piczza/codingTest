class Solution {
    public int solution(String number) {
        int addNum = 0;
        for(int i = 0; i< number.length(); i++){
            addNum += number.charAt(i) - '0';
        }
        return addNum % 9;
    }
}