class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        String[] babys = new String[]{"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String baby : babys){
                if(!babbling[i].contains(baby) || babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) continue;

                babbling[i] = babbling[i].replace(baby, " ");
            }

            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].length() == 0) result++;
        }


        return result;
    }
}