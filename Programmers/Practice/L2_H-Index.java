import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int[] citations) {
     	int answer = 0;
        Arrays.sort(citations);
        List<Integer> list = new ArrayList<>();
        
        // 내림차순으로 list에 넣어주기
        for (int i = citations.length - 1; i >= 0; i--) {
            list.add(citations[i]);
        }
        
        for (int i = 0; i < list.size(); i++) {
            // 인덱스는 1부터 유효하다. 따라서 , i+1 
            if (i + 1 <= list.get(i)) {
                if (i + 1 == list.get(i)) {
                    answer = i + 1;
                    break; // 같은값이면 더 볼 필요도 없다 ! 
                } else answer = i + 1;
            }
        }
        return answer;
    }
}
