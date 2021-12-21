class Solution {
    public int solution(int[] nums) {
       int answer = 0;
        int Pnum; // 3개의 수를 더한 값
        int cnt = 2; // 나누어 줄 값
        boolean b = false; // 소수 확인
        for (int i = 0; i < nums.length - 2; i++) {
            for (int k = i + 1; k < nums.length - 1; k++) {
                for (int j = k + 1; j < nums.length; j++) {
                    Pnum = nums[i] + nums[k] + nums[j];
                    // 나누는 값은 Pnum 값의 반 까지만 
                    while (Pnum != 1 && Pnum / 2 > cnt) {
                        if (Pnum % cnt != 0) b = true; 
                        else {
                            b = false; // 소수가 아니다 
                            break;
                        }
                        cnt++;
                    }
                    if (b == true) answer++;
                    cnt = 2;
                }
            }
        }


        return answer;
    }
}
