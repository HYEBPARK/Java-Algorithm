//https://velog.io/@hye_b/ProgrammersJava-%EB%A1%9C%EB%98%90%EC%9D%98-%EC%B5%9C%EA%B3%A0-%EC%88%9C%EC%9C%84%EC%99%80-%EC%B5%9C%EC%A0%80-%EC%88%9C%EC%9C%84


class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
      int[] answer = new int[2];
        int zero = 0; // 0의 개수
        int correct = 0; // 일치하는 번호 개수
        int rank[] = {6,6,5,4,3,2,1}; // 로또 순위별 일치하는 숫자 개수
        for(int i = 0; i < lottos.length;i++){
            for(int k =0;k < win_nums.length;k++){
                if(lottos[i]==0) {
                    zero ++;
                    break;
                }
                if(lottos[i]==win_nums[k]) {
                    correct++;
                    break;
                }
            }
        }
        answer[0]=rank[correct+zero];
        answer[1]=rank[correct];
        return answer;
    }
}
