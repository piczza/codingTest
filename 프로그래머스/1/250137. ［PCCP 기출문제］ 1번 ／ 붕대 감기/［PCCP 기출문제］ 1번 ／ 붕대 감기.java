import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int endTime = attacks[attacks.length - 1][0];
        final int MAX_HEALTH = health;
        int successCount = 0;
        Map<Integer, Integer> attackMap = new HashMap<>();
        for (int i = 0; i < attacks.length; i++) {
            attackMap.put(attacks[i][0], attacks[i][1]);
        }

        for (int time = 1; time <= endTime; time++) {
            //공격받으면 부상
            if(attackMap.containsKey(time)){
                int damgage = attackMap.get(time);

                successCount = 0;
                health -= damgage;

                if(health <= 0) {
                    health = -1;
                    break;
                }
            }
            //공격 받지 않으면 회복
            else {
                successCount++;

                if(health == MAX_HEALTH) continue;
                health += bandage[1];

                if(successCount == bandage[0]) {
                    successCount = 0;
                    health += bandage[2];
                }

                if(health > MAX_HEALTH) health = MAX_HEALTH;
            }
        }


        return health;
    }
}