import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A); // 오름차순 정렬
        Arrays.sort(B); // 오름차순 정렬
        for(int i = 0; i<A.length;i++){
            answer+=A[i] * B[B.length-i-1]; // A 배열의 제일 작은값과 B배열의 제일 큰값들을 곱해준다.
        }

        return answer;
    }
}
