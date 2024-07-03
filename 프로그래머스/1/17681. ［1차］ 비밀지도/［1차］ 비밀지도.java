class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for(int i = 0; i < n; i++) {
            String secret1 = Integer.toBinaryString(arr1[i]);
            String secret2 = Integer.toBinaryString(arr2[i]);

            while(secret1.length() < n) secret1 = "0" + secret1;
            while(secret2.length() < n) secret2 = "0" + secret2;

            String answer = "";
            for(int j = 0; j < n; j++) {
                if(secret1.split("")[j].equals("1") || secret2.split("")[j].equals("1")) answer += "#";
                else answer += " ";
            }
            result[i] = answer;
        }
        return result;
    }
}