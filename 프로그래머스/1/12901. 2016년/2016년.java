import java.util.*;
class Solution {
    public String solution(int a, int b) {
        List<String> daysSet = new ArrayList<>(){{
            add("FRI");
            add("SAT");
            add("SUN");
            add("MON");
            add("TUE");
            add("WED");
            add("THU");
        }};
        List<Integer> monthSet = new ArrayList<>(){{
            add(31);
            add(29);
            add(31);
            add(30);
            add(31);
            add(30);
            add(31);
            add(31);
            add(30);
            add(31);
            add(30);
            add(31);
        }};

        if(a > 1) {
            for (int i = 0; i < a - 1; i++) {
                b += monthSet.get(i);
            }
        }

        int c = (b % 7) - 1 == -1 ? 6 : (b % 7) - 1;

        return daysSet.get(c);
    }
}