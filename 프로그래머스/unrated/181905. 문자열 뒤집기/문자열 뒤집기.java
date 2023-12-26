class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s, e+1);
        StringBuilder sb = new StringBuilder(answer);
        my_string = my_string.replaceAll(answer, sb.reverse().toString());
        
        return my_string;
    }
}