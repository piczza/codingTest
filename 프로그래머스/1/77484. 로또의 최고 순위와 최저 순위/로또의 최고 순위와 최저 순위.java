class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int best = 0;
        int worst = 0;
        int unknownNum = 0;
        int correctNum = 0;

        for (int lotto : lottos){
            if(lotto == 0) {
                unknownNum++;
                continue;
            }
            for (int winNum : win_nums){
                if (lotto == winNum){
                    correctNum++;
                    winNum = -1;
                }
            }
        }

        switch (correctNum + unknownNum){
            case 6:
                best = 1;
                break;
            case 5:
                best = 2;
                break;
            case 4:
                best = 3;
                break;
            case 3:
                best = 4;
                break;
            case 2:
                best = 5;
                break;
            default:
                best = 6;

        }
        switch (correctNum){
            case 6:
                worst = 1;
                break;
            case 5:
                worst = 2;
                break;
            case 4:
                worst = 3;
                break;
            case 3:
                worst = 4;
                break;
            case 2:
                worst = 5;
                break;
            default:
                worst = 6;

        }

        return new int[]{best, worst};
    }
}