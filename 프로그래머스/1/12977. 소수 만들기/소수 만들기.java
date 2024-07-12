class Solution {
    public int solution(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    boolean isPrimeNum = true;

                    for (int l = 2; l * l <= num; l++) {
                        if(num % l == 0) isPrimeNum = false;
                    }

                    if(isPrimeNum) result++;
                }
            }
        }

        return result;
    }
}