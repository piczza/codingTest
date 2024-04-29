class Solution {
    public int[] solution(int money) {
        int changes = money%5500;
        int cupOf = money/5500;

        return new int[]{cupOf, changes};
    }
}