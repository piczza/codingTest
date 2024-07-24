class Solution {
    public int solution(String[][] board, int h, int w) {
        int result = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i == h - 1 && j == w){
                    if(board[i][j].equals(board[h][w])) result++;
                }
                if(j == w - 1 && i == h){
                    if(board[i][j].equals(board[h][w])) result++;
                }
                if(i == h + 1 && j == w){
                    if(board[i][j].equals(board[h][w])) result++;
                }
                if(j == w + 1 && i == h){
                    if(board[i][j].equals(board[h][w])) result++;
                }
            }
        }

        return result;
    }
}