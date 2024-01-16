class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int a = 100;
        int b = 100;
        int c = 100;
        for (int i = 0; i < rank.length; i++) {
            if(!attendance[i]) continue;
            if(rank[i] < a) {
                c = b;
                b = a;
                a = rank[i];
            }
            else if (rank[i] < b) {
                c = b;
                b = rank[i];
            }
            else if (rank[i] < c) c = rank[i];
        }
        boolean tempA= false;
        boolean tempB= false;
        boolean tempC = false;
        for (int i = 0; i < rank.length; i++) {
            if(a == rank[i] && !tempA) {
                a = i;
                tempA = true;
            }
            if(b == rank[i] && !tempB) {
                b = i;
                tempB = true;
            }
            if(c == rank[i] && !tempC) {
                c = i;
                tempC = true;
            }
        }
        return 10000 * a + 100 * b + c;

    }
}