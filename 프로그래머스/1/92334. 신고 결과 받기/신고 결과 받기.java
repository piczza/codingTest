import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < report.length; i++) {
            String fromReport = report[i].split(" ")[0];
            String toReport = report[i].split(" ")[1];
            List<String> reportList = map.getOrDefault(toReport, new ArrayList<>());
            if (!reportList.contains(fromReport)) {
                reportList.add(fromReport);
                map.put(toReport, reportList);
            }

        }

        for (String name : map.keySet()) {
            List<String> strs = map.get(name);
            if(strs.size() < k) continue;

            for (int i = 0; i < strs.size(); i++) {
                for (int j = 0; j < id_list.length; j++) {
                    if(strs.get(i).equals(id_list[j])) result[j]++;
                }
            }

        }

        return result;
    }
}