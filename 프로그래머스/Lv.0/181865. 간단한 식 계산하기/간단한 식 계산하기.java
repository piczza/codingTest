class Solution {
    public int solution(String binomial) {
        int a = Integer.parseInt(binomial.split(" ")[0]);
        String op = binomial.split(" ")[1];
        int b = Integer.parseInt(binomial.split(" ")[2]);

        int answer = 0;
        switch (op){
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        return answer;
    }
}