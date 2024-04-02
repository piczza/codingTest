class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String temp = my_string.split("")[i];
            if(!temp.equals("a") && !temp.equals("e") && !temp.equals("i") && !temp.equals("o") && !temp.equals("u")) answer += temp;
        }
        return answer;
    }
}