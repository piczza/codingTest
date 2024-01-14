class Solution {
    public int solution(String myString, String pat) {
        String temp = "";
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == 'A') temp += "B";
            if(myString.charAt(i) == 'B') temp += "A";
        }
        return temp.contains(pat) ? 1 : 0;
    }
}