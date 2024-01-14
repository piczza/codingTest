import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if(arr1.length > arr2.length) answer = 1;
        else if(arr1.length < arr2.length) answer = -1;
        else{
            int arr1Temp = Arrays.stream(arr1).sum();
            int arr2Temp = Arrays.stream(arr2).sum();
            if(arr1Temp > arr2Temp) answer = 1;
            else if(arr1Temp < arr2Temp) answer = -1;
            else answer = 0;
        }
        return answer;
    }
}