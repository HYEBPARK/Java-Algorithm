//https://velog.io/@hye_b/ProgrammersJava-%EC%8B%A4%ED%8C%A8%EC%9C%A8

class Solution {
    public int[] solution(int N, int[] stages) {
       int[] stage = new int[N];
        double clear = 0;
        double fail = 0;

        double[]result = new double[N];

        for (int k = 0; k < N; k++) {
            stage[k]=k+1;
            for (int i = 0; i < stages.length; i++) {
                if(stages[i]>=k+1) clear++;
                if(stages[i]==k+1) fail++;
            }
            double failrate = fail/clear;
            result[k] = failrate;
            if (clear == 0) result[k] = 0;
            clear = 0;
            fail = 0;
        }
        while(N>0) {
            for (int i = 0; i < result.length - 1; i++) {

                double tmp = result[i];
                int tmp1 = stage[i];
                if (result[i] < result[i + 1]) {
                    result[i] = result[i + 1];
                    result[i + 1] = tmp;
                    stage[i] = stage[i + 1];
                    stage[i + 1] = tmp1;
                }
                
            }
            N--;
        }


        return stage;
    }
}
