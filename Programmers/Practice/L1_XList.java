public class L1_XList {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i = 0;i<answer.length;i++){

            answer[0] = x;
            if(i>0) {
                answer[i] = x + answer[i - 1];
                }
            }
        return answer;
    }

    public static void main(String[] args) {

    }
}
