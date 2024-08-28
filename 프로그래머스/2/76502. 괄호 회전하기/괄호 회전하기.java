import java.util.*;
class Solution {
    public int solution(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String newS = s.substring(i, s.length()) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();

            for (Character c : newS.toCharArray()) {
                if(!stack.isEmpty() &&
                        ((stack.peek().equals('[') && c.equals(']')) ||
                        (stack.peek().equals('{') && c.equals('}'))||
                        (stack.peek().equals('(') && c.equals(')')))) {
                    stack.pop();
                    continue;
                }

                stack.push(c);
                if(c.equals(')') || c.equals('}') || c.equals(']')) break;

            }

            if (stack.isEmpty()) result++;
        }

        return result;
    }
}