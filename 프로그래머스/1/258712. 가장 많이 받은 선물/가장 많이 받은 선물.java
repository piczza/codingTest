import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int result = 0;
        Map<String, Integer> friendMap = new HashMap<>();
        int[] giftScore = new int[friends.length];
        int[][] giftGragh = new int[friends.length][friends.length];

        for (int i = 0; i < friends.length; i++) {
            friendMap.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] split = gift.split(" ");
            giftScore[friendMap.get(split[0])]++;
            giftScore[friendMap.get(split[1])]--;
            giftGragh[friendMap.get(split[0])][friendMap.get(split[1])]++;

        }

        for (int i = 0; i < friends.length; i++) {
            int num = 0;
            for (int j = 0; j < friends.length; j++) {
                if(i==j) continue;

                if(giftGragh[i][j] > giftGragh[j][i] ||
                (giftGragh[i][j] == giftGragh[j][i] && giftScore[i] > giftScore[j])){
                    num++;
                }
            }
            if(result < num) result = num;
        }

        return result;
    }
}