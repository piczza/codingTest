class Solution {
    public int solution(String s) {
        int result = 0;

        while (s.length() > 0) {
            String x = s.split("")[0];
            int equalsX = 1;
            int notEqualsX = 0;

            if(s.length() == 1) {
                result++;
                s = "";
                break;
            }

            for (int i = 1; i < s.length(); i++) {
                String str = s.split("")[i];
                if(x.equals(str)) equalsX++;
                else notEqualsX++;

                if(equalsX == notEqualsX) {
                    s = s.replaceFirst(s.substring(0, i + 1), "");
                    result++;
                    break;
                }
            }

            if(equalsX != notEqualsX) {
                result++;
                break;
            }

        }

        return result;
    }
}