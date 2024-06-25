class Solution {
    public int solution(int[][] sizes) {
        int result = 0;
        int widthMax = 0;
        int heightMax = 0;
        for (int[] size: sizes){
            int width = Math.min(size[0], size[1]);
            int height = Math.max(size[0], size[1]);
            widthMax = Math.max(widthMax, width);
            heightMax = Math.max(heightMax, height);
        }

        result = widthMax * heightMax;

        return result;
    }
}