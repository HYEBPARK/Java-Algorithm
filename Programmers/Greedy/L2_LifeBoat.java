// https://velog.io/@hye_b/ProgrammersJava-%EA%B5%AC%EB%AA%85%EB%B3%B4%ED%8A%B8

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(people); // 오름차순 정렬
        for(int i : people) list.add(i); // list에 추가 
        
        while (!list.isEmpty()){
            // 보트에 한명만 남는 경우
            if(list.size()==1) {
                answer++;
                break;
            }
            // 제일 가벼운 사람과 무거운 사람의 합이 limit보다 큰 경우
            if(list.get(0)+list.get(list.size()-1) > limit){
                answer++;
                list.remove(list.size()-1); // 무거운 사람은 보트를 혼자 타야한다.
            }
            // 제일 가벼운 사람과 무거운 사람의 합이 limit보다 작은 경우 
            else {
                answer++; // 두사람이 함께 탈출 한다. 
                list.remove(list.size()-1); // 무거운 사람부터 먼저 list에서 제거 해줘야한다. 
                list.remove(0);
            }
        }
        return answer ;
    }
}
