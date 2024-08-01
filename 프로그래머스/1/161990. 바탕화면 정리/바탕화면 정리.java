class Solution {
    public int[] solution(String[] wallpaper) {
        int[] result = new int[4];
        result[0] = 50;
        result[1] = 50;

        for (int i = 0; i < wallpaper.length; i++) {
            if (!wallpaper[i].contains("#")) continue;

            int yIdxEnd = wallpaper[i].lastIndexOf("#");
            int yIdxStart = wallpaper[i].indexOf("#");
            int xIdx = i;

            result[0] = Math.min(xIdx, result[0]);
            result[1] = Math.min(yIdxStart, result[1]);
            result[2] = Math.max(xIdx + 1, result[2]);
            result[3] = Math.max(yIdxEnd + 1, result[3]);

        }

        return result;
    }
}