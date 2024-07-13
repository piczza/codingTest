class Solution {
    public int solution(int k, int m, int[] score) {
        int[] appleNum = new int[k];
        int result = 0;

        for (int i = 0; i < score.length; i++) {
            appleNum[score[i] - 1]++;
        }

        int currentBox = m;
        for (int i = appleNum.length - 1; i >= 0; i--) {
            while (appleNum[i] > 0) {
                if (currentBox > appleNum[i]) {
                    final int apple = appleNum[i];
                    currentBox -= apple;
                    appleNum[i] -= apple;

                } else {
                    final int empty = currentBox;
                    appleNum[i] -= empty;
                    currentBox -= empty;
                }

                if (currentBox == 0) {
                    currentBox = m;
                    result += m * (i + 1);
                }
            }
        }

        return result;
    }
}