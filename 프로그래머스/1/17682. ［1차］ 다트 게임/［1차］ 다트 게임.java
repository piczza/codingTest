class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] answerArr = new int[3];

        for (int i = 0; i < answerArr.length; i++) {
            int score = 0;
            if(isDigit(dartResult)){
                String str = dartResult.split("")[0] + dartResult.split("")[1];
                score = Integer.valueOf(str);
                dartResult = dartResult.replaceFirst(str, "");

            }
            else{
                String str = dartResult.split("")[0];
                score = Integer.valueOf(str);
                dartResult = dartResult.replaceFirst(str, "");
            }

            String bonus = dartResult.split("")[0];
            switch (bonus){
                case "S":
                    dartResult = dartResult.replaceFirst(bonus, "");
                    break;
                case "D":
                    score = score * score;
                    dartResult = dartResult.replaceFirst(bonus, "");
                    break;
                case "T":
                    score = score * score * score;
                    dartResult = dartResult.replaceFirst(bonus, "");
                    break;
            }

            answerArr[i] = score;

            if(dartResult.split("")[0].equals("*")){
                for (int j = i == 0 ? 0 : i-1; j <= i; j++) {
                    answerArr[j] = answerArr[j] * 2;
                }
                dartResult = dartResult.replaceFirst("\\*", "");
            }
            if(dartResult.split("")[0].equals("#")){
                answerArr[i] = -answerArr[i];
                dartResult = dartResult.replaceFirst("#", "");
            }

        }

        for (int num : answerArr){
            answer += num;
        }

        return answer;
    }
    
    public boolean isDigit(String str){
        char cha = str.toCharArray()[1];
        return Character.isDigit(cha);

    }
}