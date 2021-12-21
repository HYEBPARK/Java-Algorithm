import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Double> list = new ArrayList<>();
        // 3보다 작은 수를 미리 걸러준다. 
        if(n<3) answer = n;
        // 3보다 큰 수
        else {
            while (n / 3 > 0) {
                list.add((double) n % 3);
                n = n / 3;
                if (n < 3) list.add((double) n);
            }
            for (int i = 0; i < list.size(); i++) {
                // Math.pow를 사용해서 10진법으로 바꾸기 
                answer += (int) (list.get(list.size() - 1 - i) * (Math.pow(3, i))); 
            }
        }
        return answer;
    }
}
