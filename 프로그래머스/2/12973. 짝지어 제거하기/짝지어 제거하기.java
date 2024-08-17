import java.util.*;
class Solution
{
    public int solution(String s)
    {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(stack.isEmpty()) {
                stack.push(c);
                continue;

            }

            if (stack.peek().equals(c)) stack.pop();
            else stack.push(c);
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}