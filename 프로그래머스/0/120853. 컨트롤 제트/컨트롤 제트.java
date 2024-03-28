class Solution {
    public int solution(String s) {
        int answer = 0;
        int temp = 0;
        String[] strs = s.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].equals("Z")) answer -= temp;
            else {
                answer += Integer.parseInt(strs[i]);
                temp = Integer.parseInt(strs[i]);
            }

        }
        return answer;
    }
}