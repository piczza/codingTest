import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] result = new int[N];
        double[] failPer = new double[N];

        for (int i = 0; i < N; i++) {
            int failPerson = 0;
            int savePerson = 0;
            for (int j = 0; j < stages.length; j++) {
                if(stages[j] > i + 1) savePerson++;
                else if (stages[j] == i + 1){
                    savePerson++;
                    failPerson++;
                }

            }
            if(savePerson != 0) failPer[i] = (double) failPerson / savePerson;
        }

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                double max = Arrays.stream(failPer).filter(k -> k >= 0).max().getAsDouble();
                if(failPer[i] == max){
                    result[j] = i + 1;
                    failPer[i] = -1;
                    break;
                }
            }
        }


        return result;
    }
}