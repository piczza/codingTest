class Solution {
    public int solution(String my_string) {
        String[] temp = my_string.split(" ");
        int acc = Integer.parseInt(temp[0]);
        for (int i = 1; i < temp.length; i+=2) {
            if(temp[i].equals("+")) acc += Integer.parseInt(temp[i+1]);
            if(temp[i].equals("-")) acc -= Integer.parseInt(temp[i+1]);
            if(temp[i].equals("*")) acc *= Integer.parseInt(temp[i+1]);
            if(temp[i].equals("/")) acc /= Integer.parseInt(temp[i+1]);

        }
        return acc;
    }
}