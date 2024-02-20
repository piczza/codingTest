class Solution {
    public int solution(int n) {
        String tempN = n + "";
        int answer = 0;
        
        for (String str : tempN.split("")){
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}