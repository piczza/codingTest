class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String coffee : order){
            if (coffee.contains("cafelatte")) answer += 5000;
            if (coffee.contains("americano") || coffee.contains("anything")) answer += 4500;
        }
        return answer;
    }
}