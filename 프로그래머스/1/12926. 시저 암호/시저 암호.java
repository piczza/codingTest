class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (String word : s.split("")){
            if(word.equals(" ")){
                result.append(" ");
                continue;
            }

            char wordChar = word.charAt(0);
            char chr = (char) (wordChar + n);
            if(word.toUpperCase().equals(word)){
                if(wordChar + n >= 65 && wordChar + n <= 90) result.append(chr);
                else {
                    result.append((char)(wordChar + n - 26));
                }
            }
            else{
                if(wordChar + n >= 97 && wordChar + n <= 122) result.append(chr);
                else {
                    result.append((char)(wordChar + n - 26));
                }
            }

        }

        return result.toString();
    }
}