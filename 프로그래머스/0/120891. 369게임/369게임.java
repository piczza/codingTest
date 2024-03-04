class Solution {
    public int solution(int order) {
        int answer = 0;
        String temp = (order + "");
        for (int i = 0; i < temp.length(); i++) {
           if(temp.split("")[i].equals("3")) answer++;
           if(temp.split("")[i].equals("6")) answer++;
           if(temp.split("")[i].equals("9")) answer++;
        }
        return answer;
    }
}