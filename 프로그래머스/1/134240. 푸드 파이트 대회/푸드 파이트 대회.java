class Solution {
    public String solution(int[] food) {
        String result = "";
        for (int i = 1; i < food.length; i++) {
            for (int j = 1; j <= food[i]/2; j++) {
                result += i;
            }
        }

        result += "0";

        for (int i = food.length-1; i > 0; i--) {
            for (int j = 1; j <= food[i]/2; j++) {
                result += i;
            }
        }

        return result;
    }
}