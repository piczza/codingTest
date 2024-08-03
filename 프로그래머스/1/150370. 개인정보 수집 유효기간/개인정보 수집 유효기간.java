import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> resultList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String str : terms) {
            String key = str.split(" ")[0];
            Integer value = Integer.parseInt(str.split(" ")[1]);
            map.put(key, value);
        }

        for (int i = 0; i < privacies.length; i++) {

        }
        for (int i = 0; i < privacies.length; i++) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
            LocalDate toDay = LocalDate.parse(today, formatter);
            LocalDate thatDay = LocalDate.parse(privacies[i].split(" ")[0], formatter);
            String type = privacies[i].split(" ")[1];

            LocalDate achaveDay = thatDay.plusMonths(map.get(type));

            if(!toDay.isBefore(achaveDay)) resultList.add(i + 1);

        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}