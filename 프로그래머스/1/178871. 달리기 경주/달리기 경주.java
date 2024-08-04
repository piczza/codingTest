import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] result = new String[players.length];
        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(i + 1, players[i]);
            nameMap.put(players[i], i + 1);
        }

        for (String calling : callings) {
            Integer nowRank = nameMap.get(calling);
            String player = rankMap.get(nowRank);

            String frontPlayer = rankMap.get(nowRank-1);

            nameMap.put(frontPlayer, nowRank);
            nameMap.put(player, nowRank-1);
            rankMap.put(nowRank, frontPlayer);
            rankMap.put(nowRank - 1, player);
        }

        for (Integer rank : rankMap.keySet()) {
            result[rank - 1] = rankMap.get(rank);
        }

        return result;
    }
}