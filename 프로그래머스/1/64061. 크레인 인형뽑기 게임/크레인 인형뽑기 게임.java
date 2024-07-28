import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int position = moves[i] - 1;
                if(board[j][position] != 0){
                    list.add(board[j][position]);
                    board[j][position] = 0;
                    break;
                }
            }
        }

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).equals(list.get(i - 1))){
                list.remove(i);
                list.remove(i-1);
                i = Math.max(0, i - 2);
                result += 2;
            }
        }

        return result;
    }
}