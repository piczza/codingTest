class Solution {
    public int solution(int[] arr) {
        int end = arr[arr.length - 1];
        boolean isLCM = false;
        int m = 1;
        while (true) {
            end = arr[arr.length-1] * m++;
            for (int i = 0; i < arr.length - 1; i++) {
                if(end % arr[i] != 0) break;
                if(i == arr.length-2 && end % arr[i] == 0) isLCM = true;
            }
            if(isLCM) break;
        }
        return end;
    }
}