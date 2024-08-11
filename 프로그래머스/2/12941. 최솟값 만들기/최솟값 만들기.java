import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int result = 0;
        A = Arrays.stream(A).sorted().toArray();
        B = Arrays.stream(B).sorted().toArray();
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - 1 - i];
            B[B.length - 1 - i] = temp;

        }
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[i];
        }

        return result;
    }
}