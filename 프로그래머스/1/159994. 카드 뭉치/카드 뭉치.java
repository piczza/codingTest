class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Idx = 0;
        int cards2Idx = 0;
        for (String str : goal){
            if(cards1Idx < cards1.length && str.equals(cards1[cards1Idx])) {
                cards1Idx++;
                continue;
            }
            else if(cards2Idx < cards2.length && str.equals(cards2[cards2Idx])) {
                cards2Idx++;
                continue;
            }
            else return "No";
        }
        return  "Yes";
    }
}