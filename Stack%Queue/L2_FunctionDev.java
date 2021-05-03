import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
  
         Stack <Integer> day = new Stack();
         //stack에 개발 날짜 넣어주기 (스택과 배열은 거꾸로 !) 
        for(int i = progresses.length-1 ;i>=0;i--){
            if((100-progresses[i])%speeds[i]>0) day.push((100-progresses[i])/speeds[i]+1);
            else day.push((100-progresses[i])/speeds[i]) ;
        }
        List<Integer> list = new ArrayList<>();
        while(!day.isEmpty()){
            int cnt = 1;
            int first = day.pop();
            //first가 더 크거나 같다면
            while (!day.isEmpty() && first>=day.peek()){
                day.pop();
                cnt++;
            }
            list.add(cnt);
        }

        int answer[] = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            answer[i]= list.get(i);
        }
        return answer;
    }
}
