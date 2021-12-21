import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] answer = {};

            int stu1[] = {1,2,3,4,5};
            int stu2[] = {2,1,2,3,2,4,2,5};
            int stu3[] = {3,3,1,1,2,2,4,4,5,5};

            int score1 = 0;
            int score2 = 0;
            int score3 = 0;

            for(int i =0; i<answers.length;i++){
                if(answers[i]==stu1[i%5]) score1++;
                if(answers[i]==stu2[i%8]) score2++;
                if(answers[i]==stu3[i%10]) score3++;
            }

            int max = Math.max(score1,Math.max(score2,score3));

            ArrayList<Integer> list = new ArrayList<Integer>();
            if(max == score1) list.add(1);
            if(max == score2) list.add(2);
            if(max == score3) list.add(3);
            
            answer = new int[list.size()];
            for(int i = 0; i < list.size();i++){
                answer[i] = list.get(i);
            }

           
        return answer;
    }
}
