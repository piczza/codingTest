class Solution {
    public int[] solution(String s) {
        int transform = 0;
        int zeroCount = 0;

        while(!s.equals("1")){
            String[] split = s.split("");
            for (int i = 0; i < s.length(); i++) {
                if (split[i].equals("0")) {
                    zeroCount++;
                    split[i] = "";
                }
            }
            s = String.join("", split);
            s = Integer.toBinaryString(s.length());
            transform++;

        }


        return new int[]{transform, zeroCount};
    }
}