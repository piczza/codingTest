class Solution {
    public String solution(String s) {
        String[] split = s.split(" ");
        int max = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[0]);;
        for (int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);
            if(max < num) max = num;
            if(min > num) min = num;
        }

        return min + " " + max;
    }
}