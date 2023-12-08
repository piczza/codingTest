class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i = 0; i<queries.length; i++){
            int minNum = 0;
            for(int j = 0; j<arr.length; j++){
                if(queries[i][0] <= j && j <= queries[i][1] && queries[i][2] < arr[j]){
                    if(minNum == 0) minNum = arr[j];
                    else if (minNum > arr[j]) minNum = arr[j];
                }
            }
            if (minNum == 0) minNum = -1;
            answer[i] = minNum;
        }
        
        return answer;
    }
}