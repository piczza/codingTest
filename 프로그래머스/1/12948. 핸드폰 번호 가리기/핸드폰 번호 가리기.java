import java.util.Arrays;
class Solution {
    public String solution(String phone_number) {
        if (phone_number.length() == 4) return phone_number;
        String[] phoneNums = new String[phone_number.length() - 5];
        Arrays.fill(phoneNums, "*");
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) answer += "*";
            else answer += phone_number.split("")[i];

        }
        return answer;
    }
}