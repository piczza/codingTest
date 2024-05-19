class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;

        for (char c : s.toCharArray()){
            if(c == 'p') pNum++;
            if(c == 'y') yNum++;
        }

        if(pNum != yNum) answer = false;

        return answer;
    }
}