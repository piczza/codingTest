class Solution {
    public String solution(int n) {
        String result = "";
        while(n > 1){
            n -= 2;
            result += "수박";
        }
        if(n == 1) result += "수";
        return result;
    }
}