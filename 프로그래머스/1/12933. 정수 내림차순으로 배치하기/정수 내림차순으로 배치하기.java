import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] strs = String.valueOf(n).split("");
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);

        }
        return Long.valueOf(sb.reverse().toString());
    }
}