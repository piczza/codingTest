class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] operation = quiz[i].split("=")[0].trim().split(" ");
            String result = quiz[i].split("=")[1].trim();

            switch (operation[1]){
                case"-":
                    answer[i] = (Integer.parseInt(operation[0]) - Integer.parseInt(operation[2]) == Integer.parseInt(result)) ? "O" : "X";
                    break;
                case"+":
                    answer[i] = (Integer.parseInt(operation[0]) + Integer.parseInt(operation[2]) == Integer.parseInt(result)) ? "O" : "X";
                    break;
            }
        }
        return answer;
    }
}